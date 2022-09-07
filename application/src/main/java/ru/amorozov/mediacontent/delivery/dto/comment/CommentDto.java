package ru.amorozov.mediacontent.delivery.dto.comment;

import lombok.*;
import ru.amorozov.domain.entities.Comment;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortRequestDto;


import java.time.LocalDateTime;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class CommentDto  implements DataTransferObject {
    private long id;
    private LocalDateTime date;
    private UserShortRequestDto user;
    private String message;

    public static CommentDto create(Comment comment){
        var commentDto = new CommentDto();
        commentDto.id = comment.id();
        commentDto.date = comment.date();
        commentDto.user = UserShortRequestDto.create(comment.user());
        commentDto.message = comment.message();
        return commentDto;
    }
}
