package ru.amorozov.mediacontent.delivery.converters.file;


import ru.amorozov.domain.entities.File;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.file.FileDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class FileConverter implements RestConverter<FileDto, File> {
    @Override
    public FileDto toDto(File entity) {
        return null;
    }

    @Override
    public File toEntity(FileDto dto) {
        return null;
    }
}
