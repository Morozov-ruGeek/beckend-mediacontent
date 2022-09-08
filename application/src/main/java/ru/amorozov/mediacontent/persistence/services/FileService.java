package ru.amorozov.mediacontent.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.File;
import ru.amorozov.domain.repositories.FileRepositoryService;
import ru.amorozov.mediacontent.persistence.converters.FileModelConverter;
import ru.amorozov.mediacontent.persistence.repositories.FileRepository;

import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
@Service
public class FileService implements FileRepositoryService {

    private final FileRepository fileRepository;
    private final FileModelConverter fileConverter;

    @Autowired
    public FileService(FileRepository fileRepository,
                       FileModelConverter fileConverter) {
        this.fileRepository = fileRepository;
        this.fileConverter = fileConverter;
    }

    @Override
    public File save(File file) {
        var fileModel = fileConverter.toModel(file);
        return fileConverter.toEntity(fileRepository.save(fileModel));
    }

    @Override
    public void delete(long id) {
        fileRepository.deleteById(id);
    }

    @Override
    public Optional<File> findById(long id) {
        var file = fileRepository.findById(id);
        return Optional.of(fileConverter.toEntity(file.get()));
    }
}
