package ru.amorozov.mediacontent.converters.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.converters.AbstractConverter;
import ru.amorozov.mediacontent.dto.user.UserDto;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class UserConverter extends AbstractConverter<UserDto, User> {

    private final RoleConverter roleConverter;

    @Autowired
    public UserConverter(RoleConverter roleConverter) {
        this.roleConverter = roleConverter;
    }

    @Override
    public UserDto toDto(User entity) {
        return null;
    }

    @Override
    public User toEntity(UserDto dto) {
        return null;
    }
}
