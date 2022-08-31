package ru.amorozov.domain.entities;

import lombok.NonNull;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public record User(long id,
                   @NonNull String name,
                   @NonNull String email,
                   @NonNull String password,
                   @NonNull String avatar,
                   @NonNull UserRole role) implements BasicEntity {
}
