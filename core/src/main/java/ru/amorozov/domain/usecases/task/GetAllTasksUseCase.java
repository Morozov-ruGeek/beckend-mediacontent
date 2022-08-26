package ru.amorozov.domain.usecases.task;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.TaskRepository;
import ru.amorozov.domain.usecases.UseCase;

import java.util.Collection;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class GetAllTasksUseCase implements UseCase<Void, Collection<Task>> {

    private final TaskRepository taskRepository;

    public GetAllTasksUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Either<Failure, Collection<Task>> execute(Void ignore) {
        return Either.right(taskRepository.getAll());
    }
}
