package ru.amorozov.mediacontent.persistence.converters;


import ru.amorozov.domain.entities.BasicEntity;
import ru.amorozov.mediacontent.persistence.models.JpaModel;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public interface RepositoryConverter<ModelT extends JpaModel, EntityT extends BasicEntity> {

    ModelT toModel(EntityT entity);

    EntityT toEntity(ModelT dto);
}
