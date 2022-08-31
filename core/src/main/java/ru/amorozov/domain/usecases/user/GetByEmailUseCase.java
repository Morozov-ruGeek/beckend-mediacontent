package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.UserRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class GetByEmailUseCase implements UseCase<String, User> {

    private final UserRepositoryService userRepositoryService;

    public GetByEmailUseCase(UserRepositoryService userRepositoryService) {
        this.userRepositoryService = userRepositoryService;
    }

    @Override
    public Either<Failure, User> execute(@NonNull String email) {
        final var result = userRepositoryService.getByEmail(email);
        if(result.isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        return Either.right(result.get());
    }
}
