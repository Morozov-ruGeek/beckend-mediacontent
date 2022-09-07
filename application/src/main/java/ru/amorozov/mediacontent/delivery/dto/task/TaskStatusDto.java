package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.TaskStatus;
import ru.amorozov.domain.entities.enums.Status;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class TaskStatusDto implements DataTransferObject {
    private long id;
    private Status status;

    public static TaskStatusDto create(TaskStatus taskStatus){
        var taskStatusDto = new TaskStatusDto();
        taskStatusDto.id = taskStatus.id();
        taskStatusDto.status = taskStatus.status();
        return taskStatusDto;
    }
}
