package ru.amorozov.domain.entities;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */

public record Task(Long id,
                   String name,
                   ContentType type,
                   String description,
                   Collection<File> files,
                   Long authorId,
                   Long executorId,
                   LocalDateTime dateCreated,
                   LocalDateTime dateExpired,
                   Collection<Content> contents,
                   Collection<Comment> comments,
                   TaskStatus status) implements BasicEntity {
    public Task(String name,
                ContentType type,
                String description,
                Long authorId,
                Long executorId,
                LocalDateTime dateExpired) {
        this(null,
                name,
                type,
                description,
                null,
                authorId,
                executorId,
                null,
                dateExpired,
                null,
                null,
                null);
    }
}

