package ru.amorozov.mediacontent.delivery.dto.task;

import lombok.*;
import ru.amorozov.domain.entities.enums.Type;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;

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
    private @Getter UserResponseDto author;
    private @Getter UserResponseDto executor;
    private @Getter LocalDateTime dateExpired;

}
