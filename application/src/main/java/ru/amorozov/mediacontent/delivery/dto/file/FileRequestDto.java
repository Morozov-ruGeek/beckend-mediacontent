package ru.amorozov.mediacontent.delivery.dto.file;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class FileRequestDto implements DataTransferObject {
    private long id;
    private String file;
}
