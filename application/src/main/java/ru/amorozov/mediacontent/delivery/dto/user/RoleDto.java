package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class RoleDto implements DataTransferObject {
    private long id;
    private String roleName;

    public static RoleDto create(UserRole role) {
        var userRoleDto = new RoleDto();
        userRoleDto.id = role.id();
        userRoleDto.roleName = role.role().name();
        return userRoleDto;
    }

}
