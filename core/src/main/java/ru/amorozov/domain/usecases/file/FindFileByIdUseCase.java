package ru.amorozov.domain.usecases.file;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.File;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.FileRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
public class FindFileByIdUseCase implements UseCase<Integer, File> {

    private final FileRepositoryService fileRepositoryService;

    public FindFileByIdUseCase(FileRepositoryService fileRepositoryService) {
        this.fileRepositoryService = fileRepositoryService;
    }

    @Override
    public Either<Failure, File> execute(Integer id) {
        final var result = fileRepositoryService.findById(id);
        if (result.isEmpty()) {
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(result.get());
    }
}
