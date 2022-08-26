package ru.amorozov.domain.usecases;

import io.vavr.control.Either;
import lombok.NonNull;
import ru.amorozov.domain.failure.Failure;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public interface UseCase<ParamT, ResultT> {
    Either<Failure, ResultT> execute(ParamT param);
}
