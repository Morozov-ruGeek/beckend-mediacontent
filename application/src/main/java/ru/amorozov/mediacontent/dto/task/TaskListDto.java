package ru.amorozov.mediacontent.dto.task;

import lombok.*;
import ru.amorozov.mediacontent.dto.DataTransferObject;
import ru.amorozov.mediacontent.dto.content.ContentTypeDto;
import ru.amorozov.mediacontent.dto.user.UserDto;


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
    private @Getter UserDto executor;
    private @Getter LocalDateTime dateExpired;
    private @Getter TaskStatusDto status;

}
