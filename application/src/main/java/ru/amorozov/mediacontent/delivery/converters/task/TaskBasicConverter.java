package ru.amorozov.mediacontent.delivery.converters.task;


import ru.amorozov.domain.entities.Task;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskBasicDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskBasicConverter implements RestConverter<TaskBasicDto, Task> {
    @Override
    public TaskBasicDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskBasicDto dto) {
        return null;
    }
}
