package ru.amorozov.mediacontent.delivery.converters.task;


import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.Task;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class TaskConverter implements RestConverter<TaskDto, Task> {
    @Override
    public TaskDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskDto dto) {
        return null;
    }
}
