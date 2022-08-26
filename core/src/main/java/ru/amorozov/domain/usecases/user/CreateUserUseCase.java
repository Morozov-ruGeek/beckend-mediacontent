package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.repositories.UserRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class CreateUserUseCase implements UseCase<User, User> {

    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public @NonNull Either<Failure, User> execute(@NonNull User user) {
        final var emailIsExist = userRepository.isExistByEmail(user.email());
        if (emailIsExist) {
            return Either.left(new CoreFailures.EmailAlreadyExist());
        }
        return Either.right(userRepository.create(user));
    }
}
