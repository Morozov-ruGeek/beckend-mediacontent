package ru.amorozov.mediacontent.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.repositories.TaskRepositoryService;
import ru.amorozov.mediacontent.delivery.exceptions.NotFoundException;
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

    private final UserService userService;

    @Autowired
    public TaskService(TaskRepository taskRepository,
                       TaskModelConverter taskConverter,
                       UserService userService) {
        this.taskRepository = taskRepository;
        this.taskConverter = taskConverter;
        this.userService = userService;
    }

    @Override
    public Collection<Task> getAll() {
        return taskRepository.findAll().stream().map(taskConverter::toEntity).toList();
    }

    @Override
    public Task create(Task task) {
        getUser(task.authorId());
        var author = getUser(task.authorId());
        var executor = getUser(task.executorId());
        var taskModel = taskConverter.toModel(task, author, executor);
        return taskConverter.toEntity(taskRepository.save(taskModel));
    }

    @Override
    public Optional<Task> getById(long id) {
        var taskModel = taskRepository.findById(id);
        if(taskModel.isEmpty()){
            throw new NotFoundException(String.format("Задача с id = %d не найдена.",id));
        }
        return Optional.of(taskConverter.toEntity(taskModel.get()));
    }

    @Override
    public Task update(Task task) {
        var author = getUser(task.authorId());
        var executor = getUser(task.executorId());
        var taskModel = taskConverter.toModel(task, author, executor);
        return taskConverter.toEntity(taskModel);
    }

    @Override
    public void delete(long id) {
        taskRepository.deleteById(id);
    }

    private User getUser(long id) {
        var user = userService.getById(id);
        if (user.isEmpty()) {
            throw new NotFoundException(String.format("Пользователь с id = %d не найден.", id));
        } else {
            return user.get();
        }
    }
}
