package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class UserResponseDto implements DataTransferObject {

    private long id;
    private String name;
    private String email;
    private String avatar;
    private RoleDto role;

    public static UserResponseDto create(User user) {
        var userDto = new UserResponseDto();
        userDto.id = user.id();
        userDto.name = user.name();
        userDto.email = user.email();
        userDto.avatar = user.avatar();
        userDto.role = RoleDto.create(user.role());
        return userDto;
    }
}
