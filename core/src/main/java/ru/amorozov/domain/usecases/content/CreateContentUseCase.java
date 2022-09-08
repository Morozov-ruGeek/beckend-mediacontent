package ru.amorozov.domain.usecases.content;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.ContentRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class CreateContentUseCase implements UseCase<Content, Content> {

    private final ContentRepositoryService contentRepositoryService;

    public CreateContentUseCase(ContentRepositoryService contentRepositoryService) {
        this.contentRepositoryService = contentRepositoryService;
    }

    @Override
    public Either<Failure, Content> execute(Content content) {
        return Either.right(contentRepositoryService.save(content));
    }
}
