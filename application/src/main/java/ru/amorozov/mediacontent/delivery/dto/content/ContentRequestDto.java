package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

import java.util.List;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class ContentRequestDto  implements DataTransferObject {
    private @Getter List<ContentDto> contents;
    private @Getter int total;
}