package ru.amorozov.mediacontent.delivery.converters.user;


import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.persistence.converters.AbstractConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class UserShortRequestConverter extends AbstractConverter<UserShortRequestDto, User> {
    @Override
    public UserShortRequestDto toDto(User entity) {
        return null;
    }

    @Override
    public User toEntity(UserShortRequestDto dto) {
        return null;
    }
}
