package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class TaskBasicDto implements DataTransferObject {
    private long id;
    private String name;

    public static TaskBasicDto create(Task task){
        var taskBasicDto = new TaskBasicDto();
        taskBasicDto.id = task.id();
        taskBasicDto.name = task.name();
        return taskBasicDto;
    }
}
