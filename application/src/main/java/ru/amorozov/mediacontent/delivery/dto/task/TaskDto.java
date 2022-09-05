package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.comment.CommentDto;
import ru.amorozov.mediacontent.delivery.dto.content.ContentDto;
import ru.amorozov.mediacontent.delivery.dto.file.FileDto;
import ru.amorozov.mediacontent.delivery.dto.content.ContentTypeDto;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;


import java.time.LocalDateTime;
import java.util.List;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto implements DataTransferObject {
    private @Getter int id;
    private @Getter String name;
    private @Getter ContentTypeDto type;
    private @Getter String description;
    private @Getter List<FileDto> files;
    private @Getter UserResponseDto author;
    private @Getter UserResponseDto executor;
    private @Getter LocalDateTime dateCreated;
    private @Getter LocalDateTime dateExpired;
    private @Getter List<ContentDto> contents;
    private @Getter List<CommentDto> comments;
    private @Getter TaskStatusDto status;

}
