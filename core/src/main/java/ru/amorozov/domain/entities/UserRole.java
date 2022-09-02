package ru.amorozov.domain.entities;

import lombok.NonNull;
import ru.amorozov.domain.entities.enums.Role;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public record UserRole(Long id,
                       @NonNull Role role) implements BasicEntity {
}
