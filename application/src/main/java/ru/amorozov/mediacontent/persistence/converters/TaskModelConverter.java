package ru.amorozov.mediacontent.persistence.converters;

import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.TaskModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
public class TaskModelConverter implements RepositoryConverter<TaskModel, Task> {
    @Override
    public TaskModel toModel(Task entity) {
        return TaskModel.create(entity);
    }

    @Override
    public Task toEntity(TaskModel dto) {
        return null;
    }
}
