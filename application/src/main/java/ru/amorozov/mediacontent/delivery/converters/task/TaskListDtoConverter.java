package ru.amorozov.mediacontent.delivery.converters.task;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskListDto;

/**
 * @author Aleksey Morozov
 * @since 09.09.2022
 */
@Component
public class TaskListDtoConverter implements RestConverter<TaskListDto, Task> {
    /**
     * @deprecated Данное преобразование не подходит. Требуется 2 параметра.
     */
    @Deprecated(since = "необходимо найти решение")
    @Override
    public TaskListDto toDto(Task entity) {
        return null;
    }

    public TaskListDto toDto(Task entity, User executor) {
        return TaskListDto.create(entity, executor);
    }

    /**
     * @deprecated (не требуется преобразование в сущность)
     */
    @Deprecated(forRemoval = true)
    @Override
    public Task toEntity(TaskListDto dto) {
        return null;
    }
}
