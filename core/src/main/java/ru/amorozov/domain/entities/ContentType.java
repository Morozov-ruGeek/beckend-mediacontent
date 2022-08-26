package ru.amorozov.domain.entities;


import ru.amorozov.domain.entities.enums.Type;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record ContentType(int id,
                          Type name) implements BasicEntity {

}
