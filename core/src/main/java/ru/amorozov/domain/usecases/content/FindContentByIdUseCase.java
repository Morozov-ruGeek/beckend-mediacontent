package ru.amorozov.domain.usecases.content;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.ContentRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
public class FindContentByIdUseCase implements UseCase<Long, Content> {

    private final ContentRepositoryService contentRepositoryService;

    public FindContentByIdUseCase(ContentRepositoryService contentRepositoryService) {
        this.contentRepositoryService = contentRepositoryService;
    }

    @Override
    public Either<Failure, Content> execute(Long id) {
        var result = contentRepositoryService.findById(id);
        if (result.isEmpty()) {
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(result.get());
    }
}
