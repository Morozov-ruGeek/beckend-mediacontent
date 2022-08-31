package ru.amorozov.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NonNull;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record Comment(Long id,
                      @NonNull LocalDateTime date,
                      @NonNull User user,
                      @NonNull String message) implements BasicEntity {

}
