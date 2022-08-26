package ru.amorozov.domain.entities.enums;

import lombok.Getter;

public enum Format {
    DOC ("doc"),
    DOCX ("docx"),
    XLS ("xls"),
    XLSX ("xlsx"),
    PDF("pdf");

    private final @Getter String name;

    Format(String name) {
        this.name = name;
    }
}
