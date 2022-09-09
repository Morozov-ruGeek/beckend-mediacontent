package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.content.ContentTypeDto;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortResponseDto;


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
    private UserShortResponseDto executor;
    private LocalDateTime dateExpired;
    private TaskStatusDto status;

    public static TaskListDto create(Task task,
                                     User executor){
        var taskListDto = new TaskListDto();
        taskListDto.id = task.id();
        taskListDto.name = task.name();
        taskListDto.type = ContentTypeDto.create(task.type());
        taskListDto.executor = UserShortResponseDto.create(executor);
        taskListDto.dateExpired = task.dateExpired();
        taskListDto.status = TaskStatusDto.create(task.status());
        return taskListDto;
    }
}
