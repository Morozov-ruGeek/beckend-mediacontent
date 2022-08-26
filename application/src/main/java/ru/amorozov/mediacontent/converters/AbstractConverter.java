package ru.amorozov.mediacontent.converters;


import ru.amorozov.domain.entities.BasicEntity;
import ru.amorozov.mediacontent.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public abstract class AbstractConverter<DtoT extends DataTransferObject, EntityT extends BasicEntity> {

    public abstract DtoT toDto(EntityT entity);

    public abstract EntityT toEntity(DtoT dto);
}
