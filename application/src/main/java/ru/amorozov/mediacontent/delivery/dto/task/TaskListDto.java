package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.content.ContentTypeDto;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;


import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class TaskListDto implements DataTransferObject {
    private @Getter int id;
    private @Getter String name;
    private @Getter ContentTypeDto type;
    private @Getter UserResponseDto executor;
    private @Getter LocalDateTime dateExpired;
    private @Getter TaskStatusDto status;

}
