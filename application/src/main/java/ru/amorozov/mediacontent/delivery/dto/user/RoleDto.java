package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.Getter;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class RoleDto implements DataTransferObject {
    private @Getter int id;
    private @Getter String roleName;

    private RoleDto() {
    }
    public static RoleDto create(int id,
                                 String roleName) {
        var userRoleRto = new RoleDto();
        userRoleRto.id = id;
        userRoleRto.roleName = roleName;
        return userRoleRto;
    }
}
