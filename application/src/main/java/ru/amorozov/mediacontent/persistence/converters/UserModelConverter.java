package ru.amorozov.mediacontent.persistence.converters;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.UserModel;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Component
public class UserModelConverter implements RepositoryConverter<UserModel, User> {

    @Override
    public UserModel toModel(User entity) {
        return UserModel.create(entity);
    }

    @Override
    public User toEntity(UserModel model) {
        return new User(model.getId(),
                model.getName(),
                model.getEmail(),
                model.getPassword(),
                model.getAvatar(),
                new UserRole(model.getId(), model.getRole().getRole()));
    }

    public UserModel toModelWIthId(User user) {
        var userModel = UserModel.create(user);
        userModel.setId(user.id());
        return userModel;
    }
}
