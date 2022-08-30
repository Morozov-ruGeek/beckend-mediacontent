package ru.amorozov.mediacontent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.amorozov.mediacontent.models.UserModel;

import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
public interface UserRepository extends JpaRepository<UserModel, String> {
    Optional<UserModel> findByEmail(String email);
}
