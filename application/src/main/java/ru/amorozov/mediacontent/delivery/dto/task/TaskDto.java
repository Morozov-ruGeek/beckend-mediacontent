package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.Task;
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
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class TaskDto implements DataTransferObject {
    private long id;
    private String name;
    private ContentTypeDto type;
    private String description;
    private List<FileDto> files;
    private UserResponseDto author;
    private UserResponseDto executor;
    private LocalDateTime dateCreated;
    private LocalDateTime dateExpired;
    private List<ContentDto> contents;
    private List<CommentDto> comments;
    private TaskStatusDto status;

    public static TaskDto create(Task task) {
        var taskDto = new TaskDto();
        taskDto.id = task.id();
        taskDto.name = task.name();
        taskDto.type = ContentTypeDto.create(task.type());
        taskDto.description = task.description();
        taskDto.files = task.files().stream().map(FileDto::create).toList();
        taskDto.author = UserResponseDto.create(task.author());
        taskDto.executor = UserResponseDto.create(task.executor());
        taskDto.dateCreated = task.dateCreated();
        taskDto.dateExpired = task.dateExpired();
        taskDto.contents = task.contents().stream().map(ContentDto::create).toList();
        taskDto.comments = task.comments().stream().map(CommentDto::create).toList();
        taskDto.status = TaskStatusDto.create(task.status());
        return taskDto;
    }

}
