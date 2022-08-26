package ru.amorozov.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NonNull;
import ru.amorozov.domain.entities.enums.Format;

import java.time.LocalDateTime;

/**
 *
 *
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record Content(@GeneratedValue(strategy = GenerationType.IDENTITY) int id,
                      @NonNull ContentType contentType,
                      @NonNull String name,
                      @NonNull LocalDateTime dateCreated,
                      @NonNull User author,
                      @NonNull Format format,
                      @NonNull String url,
                      @NonNull String preview) implements BasicEntity {

}