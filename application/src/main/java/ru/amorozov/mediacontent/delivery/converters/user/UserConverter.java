package ru.amorozov.mediacontent.delivery.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.domain.entities.enums.Role;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public final class UserConverter implements RestConverter<UserResponseDto, User> {

    @Override
    public UserResponseDto toDto(User entity) {
        return UserResponseDto.create(entity);
    }

    @Override
    public User toEntity(UserResponseDto dto) {
        return new User(dto.getId(),
                dto.getName(),
                dto.getEmail(),
                dto.getAvatar(),
                new UserRole(dto.getRole().getId(), Role.valueOf(dto.getRole().getRoleName())));
    }
}
