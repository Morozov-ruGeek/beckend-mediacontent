package ru.amorozov.domain.usecases.comment;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.Comment;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.CommentRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class SaveCommentUseCase implements UseCase<Comment, Comment> {

    private final CommentRepository commentRepository;

    public SaveCommentUseCase(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Either<Failure, Comment> execute(Comment comment) {
        return Either.right(commentRepository.save(comment));
    }
}
