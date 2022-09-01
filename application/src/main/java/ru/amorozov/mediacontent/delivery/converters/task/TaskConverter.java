package ru.amorozov.mediacontent.delivery.converters.task;


import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.persistence.converters.AbstractConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskConverter extends AbstractConverter<TaskDto, Task> {
    @Override
    public TaskDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskDto dto) {
        return null;
    }
}
