package ru.amorozov.domain.failure;

/**
 * @author Aleksey Morozov
 * @since 25.08.2022
 */
public class CoreFailures {
    public record NotFound() implements Failure {
    }

    public record EmailAlreadyExist() implements Failure {
    }
}
