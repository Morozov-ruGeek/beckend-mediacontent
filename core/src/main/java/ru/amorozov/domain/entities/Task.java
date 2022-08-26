package ru.amorozov.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */

public record Task(@GeneratedValue(strategy = GenerationType.IDENTITY) int id,
                   @NonNull String name,
                   @NonNull ContentType type,
                   @NonNull String description,
                   @NonNull List<File> files,
                   @NonNull User author,
                   @NonNull User executor,
                   @NonNull LocalDateTime dateCreated,
                   @NonNull LocalDateTime dateExpired,
                   @NonNull List<Content> contents,
                   @NonNull List<Comment> comments,
                   @NonNull TaskStatus status) implements BasicEntity {

}

