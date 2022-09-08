package ru.amorozov.mediacontent.delivery.dto.comment;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class CommentRequestDto  implements DataTransferObject {
    private long user;
    private long task;
    private String message;
}
