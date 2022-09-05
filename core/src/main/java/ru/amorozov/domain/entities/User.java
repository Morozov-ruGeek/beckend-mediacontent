package ru.amorozov.domain.entities;

import lombok.NonNull;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public record User(Long id,
                   @NonNull String name,
                   String email,
                   String password,
                   String avatar,
                   UserRole role) implements BasicEntity {
    public User(Long id,
                @NonNull String name,
                @NonNull String email,
                @NonNull String avatar,
                @NonNull UserRole role) {
        this(id, name, email, null, avatar, role);
    }

    public User(@NonNull String name,
                @NonNull String email,
                String password,
                @NonNull String avatar,
                @NonNull UserRole role) {
        this(null, name, email, password, avatar, role);
    }

    public User(Long id, @NonNull String name) {
        this(id, name, null, null, null, null);
    }
}
