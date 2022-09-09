package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.ContentType;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class TaskRequestDto implements DataTransferObject {

    private String name;
    private ContentType type;
    private String description;
    private Long authorId;
    private Long executorId;
    private LocalDateTime dateExpired;

    public static TaskRequestDto create(Task task){
        var taskRequestDto = new TaskRequestDto();
        taskRequestDto.name = task.name();
        taskRequestDto.type = task.type();
        taskRequestDto.description = task.description();
        taskRequestDto.authorId = task.authorId();
        taskRequestDto.executorId = task.executorId();
        taskRequestDto.dateExpired = task.dateExpired();
        return taskRequestDto;
    }

}
