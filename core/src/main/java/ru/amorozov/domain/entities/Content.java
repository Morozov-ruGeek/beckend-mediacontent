package ru.amorozov.domain.entities;

import lombok.NonNull;
import ru.amorozov.domain.entities.enums.Format;

import java.time.LocalDateTime;

/**
 *
 *
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record Content(Long id,
                      @NonNull ContentType contentType,
                      @NonNull String name,
                      @NonNull LocalDateTime dateCreated,
                      @NonNull Long authorId,
                      @NonNull Format format,
                      @NonNull String url,
                      @NonNull String preview) implements BasicEntity {

}