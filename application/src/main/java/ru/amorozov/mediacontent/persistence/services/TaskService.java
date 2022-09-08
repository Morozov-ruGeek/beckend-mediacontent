package ru.amorozov.mediacontent.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.repositories.TaskRepositoryService;
import ru.amorozov.mediacontent.persistence.converters.TaskModelConverter;
import ru.amorozov.mediacontent.persistence.repositories.TaskRepository;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
@Service
public class TaskService implements TaskRepositoryService {

    private final TaskRepository taskRepository;
    private final TaskModelConverter taskConverter;

    @Autowired
    public TaskService(TaskRepository taskRepository,
                       TaskModelConverter taskConverter) {
        this.taskRepository = taskRepository;
        this.taskConverter = taskConverter;
    }

    @Override
    public Collection<Task> getAll() {
        return taskRepository.findAll().stream().map(taskConverter::toEntity).toList();
    }

    @Override
    public Task create(Task task) {
        var taskModel = taskConverter.toModel(task);
        return taskConverter.toEntity(taskRepository.save(taskModel));
    }

    @Override
    public Optional<Task> getById(long id) {
        var taskModel = taskRepository.findById(id);
        return Optional.of(taskConverter.toEntity(taskModel.get()));
    }

    @Override
    public Task update(Task task) {
        var taskModel = taskConverter.toModel(task);
        return taskConverter.toEntity(taskModel);
    }

    @Override
    public void delete(long id) {
        taskRepository.deleteById(id);
    }
}
