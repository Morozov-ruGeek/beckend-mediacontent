package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.Content;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface ContentRepository {

    Optional<Content> findById(int contentId);

    Collection<Content> getAll();

    Content save(Content content);

    void delete(int id);
}
