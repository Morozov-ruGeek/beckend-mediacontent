package ru.amorozov.mediacontent.converters.file;

import ru.amorozov.domain.entities.File;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.file.FileRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class FileRequestConverter extends AbstractConverter<FileRequestDto, File> {
    @Override
    public FileRequestDto toDto(File entity) {
        return null;
    }

    @Override
    public File toEntity(FileRequestDto dto) {
        return null;
    }
}
