package ru.amorozov.domain.usecases.content;

import io.vavr.control.Either;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.ContentRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class DeleteContentUseCase implements UseCase<Integer, Void> {

    private final ContentRepository contentRepository;

    public DeleteContentUseCase(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Either<Failure, Void> execute(Integer contentId) {
        final var result = contentRepository.findById(contentId);
        if(result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        contentRepository.delete(contentId);
        return Either.right(null);
    }
}
