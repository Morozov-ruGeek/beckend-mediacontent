package ru.amorozov.domain.usecases.content;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.ContentRepository;
import ru.amorozov.domain.usecases.UseCase;

import java.util.Collection;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class GetAllUseCase implements UseCase<Void, Collection<Content>> {

    private final ContentRepository contentRepository;

    public GetAllUseCase(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Either<Failure, Collection<Content>> execute(Void ignore) {
        return Either.right(contentRepository.getAll());
    }
}
