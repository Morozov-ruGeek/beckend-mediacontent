package ru.amorozov.mediacontent.converters.task;


import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.task.TaskStatusDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskStatusConverter extends AbstractConverter<TaskStatusDto, Task> {
    @Override
    public TaskStatusDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskStatusDto dto) {
        return null;
    }
}
