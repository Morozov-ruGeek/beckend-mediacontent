package ru.amorozov.mediacontent.dto.task;

import lombok.*;
import ru.amorozov.mediacontent.dto.DataTransferObject;
import ru.amorozov.mediacontent.dto.comment.CommentDto;
import ru.amorozov.mediacontent.dto.content.ContentDto;
import ru.amorozov.mediacontent.dto.content.ContentTypeDto;
import ru.amorozov.mediacontent.dto.file.FileDto;
import ru.amorozov.mediacontent.dto.user.UserDto;


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
    private @Getter UserDto author;
    private @Getter UserDto executor;
    private @Getter LocalDateTime dateCreated;
    private @Getter LocalDateTime dateExpired;
    private @Getter List<ContentDto> contents;
    private @Getter List<CommentDto> comments;
    private @Getter TaskStatusDto status;

}
