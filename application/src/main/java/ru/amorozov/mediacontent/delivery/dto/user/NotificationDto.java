package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.domain.entities.enums.NotificationType;
import ru.amorozov.mediacontent.delivery.dto.task.TaskBasicDto;

import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NotificationDto {
    private int id;
    private NotificationType type;
    private LocalDateTime date;
    private String message;
    private UserShortRequestDto user;
    private TaskBasicDto task;

}
