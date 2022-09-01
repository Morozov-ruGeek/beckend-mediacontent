package ru.amorozov.mediacontent.persistence.converters;

import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.UserModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
public class UserModelConverter implements RepositoryConverter<UserModel, User> {

    @Override
    public UserModel toModel(User entity) {
        return UserModel.create(entity);
    }

    @Override
    public User toEntity(UserModel dto) {
        return new User(dto.getId(),
                dto.getName(),
                dto.getEmail(),
                dto.getPassword(),
                dto.getAvatar(),
                new UserRole(dto.getId(), dto.getRole().getRole()));
    }
}
