package ru.amorozov.mediacontent.delivery.converters.task;


import ru.amorozov.domain.entities.Task;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskStatusDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskStatusConverter implements RestConverter<TaskStatusDto, Task> {
    @Override
    public TaskStatusDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskStatusDto dto) {
        return null;
    }
}
