package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.Comment;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface CommentRepository {
    Comment save(Comment comment);
}
