package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class ContentCreateRequestDto  implements DataTransferObject {
    private String file;
    private long task;
}
