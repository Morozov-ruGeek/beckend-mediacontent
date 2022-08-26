package ru.amorozov.mediacontent.dto.user;

import lombok.Getter;
import ru.amorozov.domain.entities.enums.Role;
import ru.amorozov.mediacontent.dto.DataTransferObject;

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
                                 Role role) {
        var userDto = new UserDto();
        userDto.id = id;
        userDto.role = RoleDto.create(role.getId(), role.getName());
        return userDto;
    }
}
