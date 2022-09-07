package ru.amorozov.mediacontent.delivery.converters.content;


import ru.amorozov.domain.entities.ContentType;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.content.ContentTypeDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class ContentTypeConverter implements RestConverter<ContentTypeDto, ContentType> {
    @Override
    public ContentTypeDto toDto(ContentType entity) {
        return null;
    }

    @Override
    public ContentType toEntity(ContentTypeDto dto) {
        return null;
    }
}
