package ru.amorozov.mediacontent.delivery.converters;

import ru.amorozov.domain.entities.BasicEntity;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
public interface RestConverter <DtoT extends DataTransferObject, EntityT extends BasicEntity>{
    DtoT toDto(EntityT entity);

    EntityT toEntity(DtoT dto);
}
