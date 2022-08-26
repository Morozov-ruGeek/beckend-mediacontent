package ru.amorozov.domain.entities.enums;

import lombok.Getter;

public enum Type {
    VIDEO ("видео"),
    AUDIO("аудио"),
    PHOTO("фото");

    private final @Getter String name;
    Type(String name) {
        this.name = name;
    }
}
