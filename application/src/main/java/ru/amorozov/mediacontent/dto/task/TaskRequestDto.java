package ru.amorozov.mediacontent.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.enums.Type;
import ru.amorozov.mediacontent.dto.DataTransferObject;
import ru.amorozov.mediacontent.dto.user.UserDto;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequestDto implements DataTransferObject {

    private @Getter String name;
    private @Getter Type type;
    private @Getter String description;
    private @Getter UserDto author;
    private @Getter UserDto executor;
    private @Getter LocalDateTime dateExpired;

}
