package ru.amorozov.mediacontent.delivery.converters.file;

import ru.amorozov.domain.entities.File;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.file.FileRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class FileRequestConverter implements RestConverter<FileRequestDto, File> {
    @Override
    public FileRequestDto toDto(File entity) {
        return null;
    }

    @Override
    public File toEntity(FileRequestDto dto) {
        return null;
    }
}
