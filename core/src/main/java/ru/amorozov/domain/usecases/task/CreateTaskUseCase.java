package ru.amorozov.domain.usecases.task;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.TaskRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class CreateTaskUseCase implements UseCase<Task, Task> {

    private final TaskRepositoryService taskRepository;

    public CreateTaskUseCase(TaskRepositoryService taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Either<Failure, Task> execute(Task task) {
        return Either.right(taskRepository.create(task));
    }
}
