package ru.amorozov.mediacontent.persistence.converters;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.File;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.FileModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Component
public class FileModelConverter implements RepositoryConverter<FileModel, File> {
    @Override
    public FileModel toModel(File entity) {
        return FileModel.create(entity);
    }

    @Override
    public File toEntity(FileModel model) {
        return new File(model.getId(), model.getName(), model.getDateCreated(), model.getFormat(), model.getUrl());
    }
}
