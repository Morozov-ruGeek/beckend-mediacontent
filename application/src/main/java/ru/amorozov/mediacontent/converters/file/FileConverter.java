package ru.amorozov.mediacontent.converters.file;


import ru.amorozov.domain.entities.File;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.file.FileDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class FileConverter extends AbstractConverter<FileDto, File> {
    @Override
    public FileDto toDto(File entity) {
        return null;
    }

    @Override
    public File toEntity(FileDto dto) {
        return null;
    }
}
