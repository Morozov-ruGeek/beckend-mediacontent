package ru.amorozov.domain.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import ru.amorozov.domain.entities.enums.Format;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record File(@GeneratedValue(strategy = GenerationType.IDENTITY) int id,
                   String name,
                   LocalDateTime dateCreated,
                   Format format,
                   String url) implements BasicEntity {

}
