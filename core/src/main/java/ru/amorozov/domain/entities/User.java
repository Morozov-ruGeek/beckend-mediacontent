package ru.amorozov.domain.entities;

import jakarta.persistence.GeneratedValue;
import lombok.NonNull;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public record User(@GeneratedValue(generator = "uuid") String id,
                   @NonNull String name,
                   @NonNull String email,
                   @NonNull String password,
                   @NonNull String avatar,
                   @NonNull UserRole userRole) {
}
