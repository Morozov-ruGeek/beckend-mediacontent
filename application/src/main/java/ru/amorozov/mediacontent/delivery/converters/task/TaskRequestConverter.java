package ru.amorozov.mediacontent.delivery.converters.task;


import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskRequestConverter implements RestConverter<TaskRequestDto, Task> {
    @Override
    public TaskRequestDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskRequestDto dto) {
        return null;
    }
}
