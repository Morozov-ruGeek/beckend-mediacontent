package ru.amorozov.mediacontent.delivery.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public final class UserShortRequestConverter implements RestConverter<UserShortRequestDto, User> {
    @Override
    public UserShortRequestDto toDto(User entity) {
        return UserShortRequestDto.create(entity);
    }

    @Override
    public User toEntity(UserShortRequestDto dto) {
        return new User(dto.getId(), dto.getName());
    }
}
