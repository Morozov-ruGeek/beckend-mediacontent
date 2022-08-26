package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.File;

import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface FileRepository {
    File save(File file);

    void delete(int id);

    Optional<File> findById(int id);
}
