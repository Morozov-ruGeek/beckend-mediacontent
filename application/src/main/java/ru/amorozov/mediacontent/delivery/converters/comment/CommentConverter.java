package ru.amorozov.mediacontent.delivery.converters.comment;


import ru.amorozov.domain.entities.Comment;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.comment.CommentDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class CommentConverter implements RestConverter<CommentDto, Comment> {
    @Override
    public CommentDto toDto(Comment entity) {
        return null;
    }

    @Override
    public Comment toEntity(CommentDto dto) {
        return null;
    }
}
