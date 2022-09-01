package ru.amorozov.mediacontent.delivery.converters.content;


import ru.amorozov.domain.entities.Content;
import ru.amorozov.mediacontent.persistence.converters.AbstractConverter;
import ru.amorozov.mediacontent.delivery.dto.content.ContentCreateRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class ContentCreateRequestConverter extends AbstractConverter<ContentCreateRequestDto, Content> {
    @Override
    public ContentCreateRequestDto toDto(Content entity) {
        return null;
    }

    @Override
    public Content toEntity(ContentCreateRequestDto dto) {
        return null;
    }
}
