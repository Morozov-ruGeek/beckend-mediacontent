package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.entities.enums.Type;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class TaskRequestDto implements DataTransferObject {

    private String name;
    private Type type;
    private String description;
    private UserResponseDto author;
    private UserResponseDto executor;
    private LocalDateTime dateExpired;

    public static TaskRequestDto create(Task task){
        var taskRequestDto = new TaskRequestDto();
        taskRequestDto.name = task.name();
        taskRequestDto.type = task.type().name();
        taskRequestDto.description = task.description();
        taskRequestDto.author = UserResponseDto.create(task.author());
        taskRequestDto.executor = UserResponseDto.create(task.executor());
        taskRequestDto.dateExpired = task.dateExpired();
        return taskRequestDto;
    }

}
