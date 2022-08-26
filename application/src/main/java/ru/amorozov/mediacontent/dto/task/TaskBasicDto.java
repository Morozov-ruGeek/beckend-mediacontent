package ru.amorozov.mediacontent.dto.task;

import lombok.*;
import ru.amorozov.mediacontent.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class TaskBasicDto implements DataTransferObject {
    private @Getter int id;
    private @Getter String name;
}
