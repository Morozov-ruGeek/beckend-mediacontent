package ru.amorozov.domain.entities;

import lombok.NonNull;
import ru.amorozov.domain.entities.enums.Format;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record File(long id,
                   @NonNull String name,
                   @NonNull LocalDateTime dateCreated,
                   @NonNull Format format,
                   @NonNull String url) implements BasicEntity {

}
