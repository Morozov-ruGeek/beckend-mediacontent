package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.UserRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class UpdateUserUseCase implements UseCase<User, User> {

    private final UserRepository userRepository;

    public UpdateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Either<Failure, User> execute(@NonNull User user) {
        if(userRepository.getByEmail(user.email()).isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(userRepository.update(user));
    }

}
