package ru.amorozov.mediacontent.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.user.UserRequestDto;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class UserRequestConverter extends AbstractConverter<UserRequestDto, User> {
    @Override
    public UserRequestDto toDto(User entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User toEntity(UserRequestDto dto) {
        throw new UnsupportedOperationException();
    }
}
