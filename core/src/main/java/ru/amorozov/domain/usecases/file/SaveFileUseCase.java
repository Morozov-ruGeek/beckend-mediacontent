package ru.amorozov.domain.usecases.file;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.entities.File;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.FileRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class SaveFileUseCase implements UseCase<File, File> {

    private final FileRepositoryService fileRepositoryService;

    public SaveFileUseCase(FileRepositoryService fileRepositoryService) {
        this.fileRepositoryService = fileRepositoryService;
    }

    @Override
    public @NonNull Either<Failure, File> execute(File file) {
        return Either.right(fileRepositoryService.save(file));
    }
}
