package ru.amorozov.mediacontent.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.repositories.UserRepositoryService;
import ru.amorozov.mediacontent.persistence.converters.UserModelConverter;
import ru.amorozov.mediacontent.persistence.repositories.UserRepository;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
@Service
public class UserService implements UserRepositoryService {

    private final UserRepository userRepository;
    private final UserModelConverter converter;

    @Autowired
    public UserService(UserRepository userRepository,
                       UserModelConverter converter) {
        this.userRepository = userRepository;
        this.converter = converter;
    }

    @Override
    public User create(User user) {
        var userModel = converter.toModel(user);
        return converter.toEntity(userRepository.save(userModel));
    }

    @Override
    public User update(User user) {
        var userModel = converter.toModelWIthId(user);
        return converter.toEntity(userRepository.save(userModel));
    }

    @Override
    public void delete(String email) {
        userRepository.deleteByEmail(email);
    }

    @Override
    public Optional<User> getByEmail(String email) {
        var user = userRepository.findByEmail(email);
        return Optional.of(converter.toEntity(user.get()));
    }

    @Override
    public Collection<User> getAll() {
        return userRepository.findAll().stream().map(converter::toEntity).toList();
    }

    @Override
    public Optional<User> getById(Long id) {
        var user = userRepository.findById(id);
        return Optional.ofNullable(converter.toEntity(user.get()));
    }
}
