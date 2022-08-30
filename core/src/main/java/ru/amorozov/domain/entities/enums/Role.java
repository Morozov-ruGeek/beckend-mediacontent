package ru.amorozov.domain.entities.enums;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public enum Role {

    ADMIN("Администратор"),

    MANAGER("Менеджер"),

    CONTENT_MAKER("Контент-мейкер");

    private final @Getter String name;

    Role(@NonNull String name) {
        this.name = name;
    }
}
