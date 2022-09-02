package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.*;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.enums.Role;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class UserRequestDto implements DataTransferObject {

    private String name;
    private String email;
    private String password;
    private String avatar;
    private Role role;

    public static UserRequestDto create(User user) {
        var userRequestDto = new UserRequestDto();
        userRequestDto.name = user.name();
        userRequestDto.email = user.email();
        userRequestDto.password = user.password();
        userRequestDto.avatar = user.avatar();
        userRequestDto.role = user.role().role();
        return userRequestDto;
    }

}
