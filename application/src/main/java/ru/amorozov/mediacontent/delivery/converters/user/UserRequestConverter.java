package ru.amorozov.mediacontent.delivery.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserRequestDto;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class UserRequestConverter implements RestConverter<UserRequestDto, User> {
    @Override
    public UserRequestDto toDto(User entity) {
        return UserRequestDto.create(entity);
    }

    @Override
    public User toEntity(UserRequestDto dto) {
        return new User(dto.getName(),
                dto.getEmail(),
                dto.getPassword(),
                dto.getAvatar(),
                new UserRole(dto.getRole()));
    }
}
