package ru.amorozov.domain.entities.enums;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public enum UserRole {

    ADMIN(1, "Администратор"),

    MANAGER(2, "Менеджер"),

    CONTENT_MAKER(3, "Контент-мейкер");

    private final @Getter int id;

    private final @Getter String name;

    UserRole(int id, @NonNull String name) {
        this.id = id;
        this.name = name;
    }
}
