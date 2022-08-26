package ru.amorozov.mediacontent.dto.user;

import lombok.*;
import ru.amorozov.mediacontent.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class UserShortRequestDto implements DataTransferObject {
    private @Getter @Setter int id;
    private @Getter @Setter String name;

}
