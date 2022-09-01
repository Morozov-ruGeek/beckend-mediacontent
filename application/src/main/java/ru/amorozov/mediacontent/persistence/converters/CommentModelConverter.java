package ru.amorozov.mediacontent.persistence.converters;

import ru.amorozov.domain.entities.Comment;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.CommentModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
public class CommentModelConverter implements RepositoryConverter<CommentModel, Comment> {
    @Override
    public CommentModel toModel(Comment entity) {
        return CommentModel.create(entity);
    }

    @Override
    public Comment toEntity(CommentModel dto) {
        return new Comment(dto.getId(),
                dto.getDate(),
                new User(dto.getUser().getId(),
                        dto.getUser().getName(),
                        dto.getUser().getEmail(),
                        dto.getUser().getPassword(),
                        dto.getUser().getAvatar(),
                        new UserRole(dto.getUser().getRole().getId(), dto.getUser().getRole().getRole())),
                dto.getMessage());
    }
}
