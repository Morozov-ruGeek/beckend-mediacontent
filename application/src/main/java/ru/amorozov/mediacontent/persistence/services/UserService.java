package ru.amorozov.mediacontent.persistence.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.repositories.UserRepositoryService;
import ru.amorozov.mediacontent.delivery.converters.user.UserRequestConverter;
import ru.amorozov.mediacontent.persistence.repositories.UserRepository;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
@Service
@RequiredArgsConstructor
public class UserService implements UserRepositoryService {

    private final UserRepository userRepository;

    private final UserRequestConverter converter;

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(String email) {

    }

    @Override
    public Optional<User> getByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Collection<User> getAll() {
        return null;
    }

    @Override
    public Optional<User> getById(Long id) {
        return Optional.empty();
    }
}
