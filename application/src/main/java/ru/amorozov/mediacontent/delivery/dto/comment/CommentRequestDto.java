package ru.amorozov.mediacontent.delivery.dto.comment;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommentRequestDto  implements DataTransferObject {
    private @Getter int user;
    private @Getter int task;
    private @Getter String message;
}
