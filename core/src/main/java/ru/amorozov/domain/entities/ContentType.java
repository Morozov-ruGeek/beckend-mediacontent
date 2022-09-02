package ru.amorozov.domain.entities;

import lombok.NonNull;
import ru.amorozov.domain.entities.enums.Type;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public record ContentType(Long id,
                          @NonNull Type name) implements BasicEntity {

}
