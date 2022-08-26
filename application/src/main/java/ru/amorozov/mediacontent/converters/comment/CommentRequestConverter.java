package ru.amorozov.mediacontent.converters.comment;


import ru.amorozov.domain.entities.Comment;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.comment.CommentRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class CommentRequestConverter extends AbstractConverter<CommentRequestDto, Comment> {
    @Override
    public CommentRequestDto toDto(Comment entity) {
        return null;
    }

    @Override
    public Comment toEntity(CommentRequestDto dto) {
        return null;
    }
}
