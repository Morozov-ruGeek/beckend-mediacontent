package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.Getter;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class UserDto implements DataTransferObject {

    private @Getter int id;
    private @Getter String name;
    private @Getter String email;
    private @Getter String avatar;
    private @Getter RoleDto role;

    private UserDto() {
    }

    public static UserDto create(int id,
                                 String name,
                                 String email,
                                 String avatar,
                                 UserRole role) {
        var userDto = new UserDto();
        userDto.id = id;
        userDto.role = RoleDto.create(role.id(), role.role().getName());
        return userDto;
    }
}
