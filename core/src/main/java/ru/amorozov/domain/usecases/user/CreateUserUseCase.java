package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.repositories.UserRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class CreateUserUseCase implements UseCase<User, User> {

    private final UserRepositoryService userRepositoryService;

    public CreateUserUseCase(UserRepositoryService userRepositoryService) {
        this.userRepositoryService = userRepositoryService;
    }

    @Override
    public @NonNull Either<Failure, User> execute(@NonNull User user) {
        final var result = userRepositoryService.getByEmail(user.email());
        if (result.isEmpty()) {
            return Either.left(new CoreFailures.EmailAlreadyExist());
        }
        return Either.right(userRepositoryService.create(user));
    }
}
