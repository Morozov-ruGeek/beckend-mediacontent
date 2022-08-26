package ru.amorozov.mediacontent.dto.comment;

import lombok.*;
import ru.amorozov.mediacontent.dto.DataTransferObject;
import ru.amorozov.mediacontent.dto.user.UserShortRequestDto;


import java.time.LocalDateTime;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto  implements DataTransferObject {
    private @Getter int id;
    private @Getter LocalDateTime date;
    private @Getter UserShortRequestDto user;
    private @Getter String message;
}
