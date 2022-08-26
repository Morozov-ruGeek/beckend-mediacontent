package ru.amorozov.domain.entities.enums;

import lombok.Getter;

public enum Status {
    IN_WORK("В работе"),
    FEEDBACK("На подтверждении"),
    APPROVED("Выполнено");

    private final @Getter String name;

    Status(String name) {
        this.name = name;
    }
}
