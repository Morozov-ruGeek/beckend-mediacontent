package ru.amorozov.mediacontent.delivery.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.domain.entities.enums.Role;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.user.RoleDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public final class RoleConverter implements RestConverter<RoleDto, UserRole> {
    @Override
    public RoleDto toDto(UserRole entity) {
        return RoleDto.create(entity);
    }

    @Override
    public UserRole toEntity(RoleDto dto) {
        return new UserRole(dto.getId(), Role.valueOf(dto.getRoleName()));
    }
}
