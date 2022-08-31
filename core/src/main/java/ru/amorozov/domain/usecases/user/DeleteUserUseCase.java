package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.UserRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class DeleteUserUseCase implements UseCase<String, Void> {

    private final UserRepositoryService userRepositoryService;

    public DeleteUserUseCase(UserRepositoryService userRepositoryService) {
        this.userRepositoryService = userRepositoryService;
    }

    @Override
    public Either<Failure, Void> execute(@NonNull String email) {
        if(userRepositoryService.getByEmail(email).isEmpty()){
            return Either.left(new CoreFailures.NotFound());
        }
        userRepositoryService.delete(email);
        return Either.right(null);
    }
}
