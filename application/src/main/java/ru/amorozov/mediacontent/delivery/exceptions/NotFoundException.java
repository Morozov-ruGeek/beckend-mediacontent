package ru.amorozov.mediacontent.delivery.exceptions;

import org.springframework.http.HttpStatus;

/**
 * @author Aleksey Morozov
 * @since 05.09.2022
 */
public class NotFoundException extends HttpException {
    public NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND.value(), message);
    }
}
