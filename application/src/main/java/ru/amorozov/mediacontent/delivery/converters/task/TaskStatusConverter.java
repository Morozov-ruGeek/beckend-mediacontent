package ru.amorozov.mediacontent.delivery.converters.task;

import org.springframework.stereotype.Component;

import ru.amorozov.domain.entities.TaskStatus;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskStatusDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class TaskStatusConverter implements RestConverter<TaskStatusDto, TaskStatus> {
    @Override
    public TaskStatusDto toDto(TaskStatus entity) {
        return TaskStatusDto.create(entity);
    }

    @Override
    public TaskStatus toEntity(TaskStatusDto dto) {
        return new TaskStatus(dto.getId(), dto.getStatus());
    }
}
