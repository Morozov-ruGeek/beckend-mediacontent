package ru.amorozov.mediacontent.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.amorozov.domain.entities.enums.Role;
import ru.amorozov.mediacontent.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto implements DataTransferObject {

    private @Getter String name;
    private @Getter String email;
    private @Getter String password;
    private @Getter String avatar;
    private @Getter Role role;

}
