package ru.amorozov.mediacontent.delivery.exceptions;

import lombok.Getter;

/**
 * @author Aleksey Morozov
 * @since 05.09.2022
 */
@Getter
public abstract class HttpException extends RuntimeException {

    private final int code;

    public HttpException(final int code, final String message) {
        super(message);
        this.code = code;
    }
}
