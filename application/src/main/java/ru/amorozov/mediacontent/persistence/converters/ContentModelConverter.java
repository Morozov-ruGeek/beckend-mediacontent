package ru.amorozov.mediacontent.persistence.converters;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.entities.ContentType;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.ContentModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Component
public class ContentModelConverter implements RepositoryConverter<ContentModel, Content> {
    @Override
    public ContentModel toModel(Content entity) {
        return ContentModel.create(entity);
    }

    @Override
    public Content toEntity(ContentModel model) {
        return new Content(model.getId(),
                new ContentType(
                        model.getContentType().getId(),
                        model.getContentType().getType()),
                model.getName(),
                model.getDateCreated(),
                new User(model.getAuthor().getId(),
                        model.getAuthor().getName(),
                        model.getAuthor().getEmail(),
                        model.getAuthor().getPassword(),
                        model.getAuthor().getAvatar(),
                        new UserRole(model.getAuthor().getRole().getId(),
                                model.getAuthor().getRole().getRole())),
                model.getFormat(),
                model.getUrl(),
                model.getPreview());
    }
}
