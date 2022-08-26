package ru.amorozov.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NonNull;
import ru.amorozov.domain.entities.enums.UserRole;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public record User(@GeneratedValue(strategy = GenerationType.UUID, generator = "uuid") String id,
                   @NonNull String name,
                   @NonNull String email,
                   @NonNull String password,
                   @NonNull String avatar,
                   @NonNull UserRole userRole) implements BasicEntity {
}
