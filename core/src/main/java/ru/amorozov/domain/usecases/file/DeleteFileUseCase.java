package ru.amorozov.domain.usecases.file;

import io.vavr.control.Either;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.FileRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class DeleteFileUseCase implements UseCase<Integer, Void> {

    private final FileRepositoryService fileRepositoryService;

    public DeleteFileUseCase(FileRepositoryService fileRepositoryService) {
        this.fileRepositoryService = fileRepositoryService;
    }

    @Override
    public Either<Failure, Void> execute(Integer fileId) {
        final var result = fileRepositoryService.findById(fileId);
        if (result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        fileRepositoryService.delete(fileId);
        return Either.right(null);
    }
}
