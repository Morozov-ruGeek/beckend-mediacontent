package ru.amorozov.mediacontent.converters.task;


import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.task.TaskRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskRequestConverter extends AbstractConverter<TaskRequestDto, Task> {
    @Override
    public TaskRequestDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskRequestDto dto) {
        return null;
    }
}
