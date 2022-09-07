package ru.amorozov.mediacontent.delivery.converters.comment;


import ru.amorozov.domain.entities.Comment;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.comment.CommentRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class CommentRequestConverter implements RestConverter<CommentRequestDto, Comment> {
    @Override
    public CommentRequestDto toDto(Comment entity) {
        return null;
    }

    @Override
    public Comment toEntity(CommentRequestDto dto) {
        return null;
    }
}
