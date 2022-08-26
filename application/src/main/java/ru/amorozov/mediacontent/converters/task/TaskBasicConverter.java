package ru.amorozov.mediacontent.converters.task;


import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.task.TaskBasicDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class TaskBasicConverter extends AbstractConverter<TaskBasicDto, Task> {
    @Override
    public TaskBasicDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskBasicDto dto) {
        return null;
    }
}
