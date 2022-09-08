package ru.amorozov.domain.usecases.comment;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Comment;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.CommentRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class SaveCommentUseCase implements UseCase<Comment, Comment> {

    private final CommentRepositoryService commentRepositoryService;

    public SaveCommentUseCase(CommentRepositoryService commentRepositoryService) {
        this.commentRepositoryService = commentRepositoryService;
    }

    @Override
    public Either<Failure, Comment> execute(Comment comment) {
        return Either.right(commentRepositoryService.save(comment));
    }
}
