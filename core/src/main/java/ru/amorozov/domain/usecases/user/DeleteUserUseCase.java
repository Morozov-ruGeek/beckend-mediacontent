package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.UserRepository;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class DeleteUserUseCase implements UseCase<String, Void> {

    private final UserRepository userRepository;

    public DeleteUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public @NonNull Either<Failure, Void> execute(@NonNull String param) {
        if(!userRepository.isExistByEmail(param)){
            return Either.left(new CoreFailures.NotFound());
        }
        userRepository.delete(param);
        return Either.right(null);
    }
}
