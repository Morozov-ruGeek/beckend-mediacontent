package ru.amorozov.mediacontent.delivery.converters.content;


import ru.amorozov.domain.entities.Content;
import ru.amorozov.mediacontent.persistence.converters.AbstractConverter;
import ru.amorozov.mediacontent.delivery.dto.content.ContentRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class ContentRequestConverter extends AbstractConverter<ContentRequestDto, Content> {
    @Override
    public ContentRequestDto toDto(Content entity) {
        return null;
    }

    @Override
    public Content toEntity(ContentRequestDto dto) {
        return null;
    }
}
