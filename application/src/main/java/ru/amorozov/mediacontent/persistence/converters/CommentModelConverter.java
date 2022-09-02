package ru.amorozov.mediacontent.persistence.converters;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.Comment;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.persistence.models.CommentModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Component
public class CommentModelConverter implements RepositoryConverter<CommentModel, Comment> {
    @Override
    public CommentModel toModel(Comment entity) {
        return CommentModel.create(entity);
    }

    @Override
    public Comment toEntity(CommentModel model) {
        return new Comment(model.getId(),
                model.getDate(),
                new User(model.getUser().getId(),
                        model.getUser().getName(),
                        model.getUser().getEmail(),
                        model.getUser().getPassword(),
                        model.getUser().getAvatar(),
                        new UserRole(model.getUser().getRole().getId(), model.getUser().getRole().getRole())),
                model.getMessage());
    }
}
