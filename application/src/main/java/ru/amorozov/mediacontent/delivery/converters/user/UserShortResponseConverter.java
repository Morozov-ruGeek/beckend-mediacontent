package ru.amorozov.mediacontent.delivery.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortResponseDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public final class UserShortResponseConverter implements RestConverter<UserShortResponseDto, User> {
    @Override
    public UserShortResponseDto toDto(User entity) {
        return UserShortResponseDto.create(entity);
    }

    @Override
    public User toEntity(UserShortResponseDto dto) {
        return new User(dto.getId(), dto.getName());
    }
}
