package ru.amorozov.mediacontent.converters.user;


import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.user.UserShortRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
public class UserShortConverter extends AbstractConverter<UserShortRequestDto, User> {
    @Override
    public UserShortRequestDto toDto(User entity) {
        return null;
    }

    @Override
    public User toEntity(UserShortRequestDto dto) {
        return null;
    }
}
