package ru.amorozov.domain.entities;

import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */

public record Task(Long id,
                   @NonNull String name,
                   @NonNull ContentType type,
                   @NonNull String description,
                   @NonNull Collection<File> files,
                   @NonNull User author,
                   @NonNull User executor,
                   @NonNull LocalDateTime dateCreated,
                   @NonNull LocalDateTime dateExpired,
                   @NonNull Collection<Content> contents,
                   @NonNull Collection<Comment> comments,
                   @NonNull TaskStatus status) implements BasicEntity {

}

