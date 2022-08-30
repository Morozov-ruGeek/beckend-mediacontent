package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.UserRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 30.08.2022
 */
public class GetByIdUserUseCase implements UseCase<Long, User> {

    private final UserRepository userRepository;

    public GetByIdUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Either<Failure, User> execute(Long userId) {
        final var result = userRepository.getById(userId);
        if (result.isEmpty()) {
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(result.get());
    }
}
