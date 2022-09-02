package ru.amorozov.domain.entities;

import ru.amorozov.domain.entities.enums.Status;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record TaskStatus(Long id,
                         Status status) implements BasicEntity {

}
