package ru.amorozov.domain.usecases.content;

import io.vavr.control.Either;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.ContentRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class DeleteContentUseCase implements UseCase<Integer, Void> {

    private final ContentRepositoryService contentRepositoryService;

    public DeleteContentUseCase(ContentRepositoryService contentRepositoryService) {
        this.contentRepositoryService = contentRepositoryService;
    }

    @Override
    public Either<Failure, Void> execute(Integer contentId) {
        final var result = contentRepositoryService.findById(contentId);
        if(result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        contentRepositoryService.delete(contentId);
        return Either.right(null);
    }
}
