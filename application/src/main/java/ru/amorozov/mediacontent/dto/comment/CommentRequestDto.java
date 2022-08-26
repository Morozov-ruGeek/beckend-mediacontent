package ru.amorozov.mediacontent.dto.comment;

import lombok.*;
import ru.amorozov.mediacontent.dto.DataTransferObject;

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
