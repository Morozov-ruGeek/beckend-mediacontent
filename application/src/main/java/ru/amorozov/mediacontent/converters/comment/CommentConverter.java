package ru.amorozov.mediacontent.converters.comment;


import ru.amorozov.domain.entities.Comment;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.comment.CommentDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class CommentConverter extends AbstractConverter<CommentDto, Comment> {
    @Override
    public CommentDto toDto(Comment entity) {
        return null;
    }

    @Override
    public Comment toEntity(CommentDto dto) {
        return null;
    }
}
