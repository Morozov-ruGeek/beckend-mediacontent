package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class ContentCreateRequestDto  implements DataTransferObject {
    private @Getter byte[] file;
    private @Getter int task;
}
