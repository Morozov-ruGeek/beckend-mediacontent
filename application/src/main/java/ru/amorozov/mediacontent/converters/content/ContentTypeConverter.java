package ru.amorozov.mediacontent.converters.content;


import ru.amorozov.domain.entities.ContentType;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.content.ContentTypeDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class ContentTypeConverter extends AbstractConverter<ContentTypeDto, ContentType> {
    @Override
    public ContentTypeDto toDto(ContentType entity) {
        return null;
    }

    @Override
    public ContentType toEntity(ContentTypeDto dto) {
        return null;
    }
}
