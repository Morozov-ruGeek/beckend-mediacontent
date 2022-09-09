package ru.amorozov.domain.usecases.task;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.TaskRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class GetTaskByIdUseCase implements UseCase<Long, Task> {

    private final TaskRepositoryService taskRepository;

    public GetTaskByIdUseCase(TaskRepositoryService taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Either<Failure, Task> execute(Long taskId) {
        final var result = taskRepository.getById(taskId);
        if(result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(result.get());
    }
}
