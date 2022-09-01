package ru.amorozov.mediacontent.persistence.converters;

import ru.amorozov.domain.entities.Content;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.ContentModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
public class ContentModelConverter implements RepositoryConverter<ContentModel, Content> {
    @Override
    public ContentModel toModel(Content entity) {
        return ContentModel.create(entity);
    }

    @Override
    public Content toEntity(ContentModel dto) {
        return null;
    }
}
