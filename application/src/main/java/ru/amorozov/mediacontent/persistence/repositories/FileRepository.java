package ru.amorozov.mediacontent.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.amorozov.mediacontent.persistence.models.FileModel;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
public interface FileRepository extends JpaRepository<FileModel, Long> {
}
