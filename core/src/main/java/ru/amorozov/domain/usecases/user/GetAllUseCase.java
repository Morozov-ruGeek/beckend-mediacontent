package ru.amorozov.domain.usecases.user;

import io.vavr.control.Either;
import ru.amorozov.domain.entities.User;
import ru.amorozov.domain.failure.Failure;
import ru.amorozov.domain.repositories.UserRepositoryService;
import ru.amorozov.domain.usecases.UseCase;

import java.util.Collection;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class GetAllUseCase implements UseCase<Void, Collection<User>> {

    private final UserRepositoryService userRepositoryService;

    public GetAllUseCase(UserRepositoryService userRepositoryService) {
        this.userRepositoryService = userRepositoryService;
    }

    @Override
    public Either<Failure, Collection<User>> execute(Void ignore) {
        return Either.right(userRepositoryService.getAll());
    }
}
