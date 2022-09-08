package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.Content;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface ContentRepositoryService {

    Optional<Content> findById(long id);

    Collection<Content> getAll();

    Content save(Content content);

    void delete(long id);
}
