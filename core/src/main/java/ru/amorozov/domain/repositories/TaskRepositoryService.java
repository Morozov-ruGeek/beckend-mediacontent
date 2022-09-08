package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.Task;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface TaskRepositoryService {
    Collection<Task> getAll();
    Task create(Task task);
    Optional<Task> getById(long id);
    Task update(Task task);
    void delete(long id);
}
