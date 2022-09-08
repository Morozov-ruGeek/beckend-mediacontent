package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

import java.util.List;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class ContentRequestDto  implements DataTransferObject {
    private List<ContentDto> contents;
    private int total;
}
