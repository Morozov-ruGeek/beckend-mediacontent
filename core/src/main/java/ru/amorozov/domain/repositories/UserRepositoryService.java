package ru.amorozov.domain.repositories;

import ru.amorozov.domain.entities.User;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 24.08.2022
 */
public interface UserRepositoryService {
    User create(User user);

    User update(User user);

    void delete(String email);

    Optional<User> getByEmail(String email);

    Collection<User> getAll();

    Optional<User> getById(Long id);

}
