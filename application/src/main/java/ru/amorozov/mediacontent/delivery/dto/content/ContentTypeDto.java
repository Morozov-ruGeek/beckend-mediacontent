package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.domain.entities.enums.Type;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class ContentTypeDto  implements DataTransferObject {
    private @Getter int id;
    private @Getter Type type;
}
