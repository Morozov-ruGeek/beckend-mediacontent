package ru.amorozov.mediacontent.persistence.converters;

import ru.amorozov.domain.entities.File;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.FileModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
public class FileModelConverter implements RepositoryConverter<FileModel, File> {
    @Override
    public FileModel toModel(File entity) {
        return FileModel.create(entity);
    }

    @Override
    public File toEntity(FileModel dto) {
        return new File(dto.getId(), dto.getName(), dto.getDateCreated(), dto.getFormat(), dto.getUrl());
    }
}
