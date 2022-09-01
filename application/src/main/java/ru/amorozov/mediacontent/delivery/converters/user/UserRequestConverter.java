package ru.amorozov.mediacontent.delivery.converters.user;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.persistence.converters.AbstractConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserRequestDto;


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
