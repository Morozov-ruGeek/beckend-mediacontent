package ru.amorozov.domain.usecases.task;

import io.vavr.control.Either;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.TaskRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class DeleteTaskUseCase implements UseCase<Integer, Void> {

    private final TaskRepository taskRepository;

    public DeleteTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Either<Failure, Void> execute(Integer taskId) {
        final var result = taskRepository.getById(taskId);
        if(result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        taskRepository.delete(taskId);
        return Either.right(null);
    }
}
