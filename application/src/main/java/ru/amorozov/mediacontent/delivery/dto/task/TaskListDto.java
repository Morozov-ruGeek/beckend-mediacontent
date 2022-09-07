package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.content.ContentTypeDto;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;


import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class TaskListDto implements DataTransferObject {
    private long id;
    private String name;
    private ContentTypeDto type;
    private UserResponseDto executor;
    private LocalDateTime dateExpired;
    private TaskStatusDto status;

    public static TaskListDto create(Task task){
        var taskListDto = new TaskListDto();
        taskListDto.id = task.id();
        taskListDto.name = task.name();
        taskListDto.type = ContentTypeDto.create(task.type());
        taskListDto.executor = UserResponseDto.create(task.executor());
        taskListDto.dateExpired = task.dateExpired();
        taskListDto.status = TaskStatusDto.create(task.status());
        return taskListDto;
    }
}
