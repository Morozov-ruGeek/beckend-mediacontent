package ru.amorozov.mediacontent.delivery.converters.content;


import ru.amorozov.domain.entities.Content;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.content.ContentDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class ContentConverter implements RestConverter<ContentDto, Content> {
    @Override
    public ContentDto toDto(Content entity) {
        return null;
    }

    @Override
    public Content toEntity(ContentDto dto) {
        return null;
    }
}
