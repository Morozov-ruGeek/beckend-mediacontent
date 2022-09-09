package ru.amorozov.mediacontent.delivery.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.usecases.task.*;
import ru.amorozov.mediacontent.delivery.converters.task.*;
import ru.amorozov.mediacontent.delivery.dto.task.TaskDto;
import ru.amorozov.mediacontent.delivery.dto.task.TaskListDto;
import ru.amorozov.mediacontent.delivery.dto.task.TaskRequestDto;
import ru.amorozov.mediacontent.delivery.exceptions.NotFoundException;

import javax.validation.Valid;
import java.util.Collection;

import static ru.amorozov.mediacontent.delivery.DeliveryConstants.*;

/**
 * @author Aleksey Morozov
 * @since 09.09.2022
 */
@RestController
@RequestMapping(APPLICATION_NAME + API_VERSION_1 + RESOURCE_TASK)
@RequiredArgsConstructor
public class TaskController {

    private final TaskBasicConverter taskBasicConverter;
    private final TaskConverter taskConverter;
    private final TaskRequestConverter taskRequestConverter;
    private final TaskStatusConverter taskStatusConverter;
    private final TaskListDtoConverter taskListDtoConverter;
    private final CreateTaskUseCase createTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAllTasksUseCase getAllTasksUseCase;
    private final GetTaskByIdUseCase getTaskByIdUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;

    @GetMapping
    public Collection<TaskListDto> getTasks() {
        var result = getAllTasksUseCase.execute(null);
        //todo пересмотреть создание TaskListDto
        return result.get().stream().map(taskListDtoConverter::toDto).toList();
    }

    @PostMapping
    public TaskDto create(@Valid @RequestBody TaskRequestDto dto) {
        var task = taskRequestConverter.toEntity(dto);
        return taskConverter.toDto(createTaskUseCase.execute(task).get());
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable Long id) {
        var result = getTaskByIdUseCase.execute(id);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Задача с id = %d не найдена.", id));
        }
        return taskConverter.toDto(result.get());
    }

    @PostMapping("/task")
    public TaskDto update(@Valid @RequestBody TaskDto dto) {
        var task = taskConverter.toEntity(dto);
        var result = updateTaskUseCase.execute(task);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Задача с id = %d не найдена.", dto.getId()));
        }
        return taskConverter.toDto(result.get());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        var result = deleteTaskUseCase.execute(id);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Задача с id = %d не найдена.", id));
        }
    }
}
