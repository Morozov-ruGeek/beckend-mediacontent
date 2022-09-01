package ru.amorozov.mediacontent.delivery.converters.user;


import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.persistence.converters.AbstractConverter;
import ru.amorozov.mediacontent.delivery.dto.user.RoleDto;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class RoleConverter extends AbstractConverter<RoleDto, UserRole> {
    @Override
    public RoleDto toDto(UserRole entity) {
        return null;
    }

    @Override
    public UserRole toEntity(RoleDto dto) {
        return null;
    }
}
