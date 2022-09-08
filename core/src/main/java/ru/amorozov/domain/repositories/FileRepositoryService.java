package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.File;

import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface FileRepositoryService {
    File save(File file);

    void delete(long id);

    Optional<File> findById(long id);
}
