package ru.amorozov.domain.usecases.task;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.TaskRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class UpdateTaskUseCase implements UseCase<Task, Task> {

    private final TaskRepository taskRepository;

    public UpdateTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Either<Failure, Task> execute(Task task) {
        final var result = taskRepository.getById(task.id());
        if(result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(taskRepository.update(task));
    }
}
