package ru.amorozov.mediacontent.delivery.exceptions;

import org.springframework.http.HttpStatus;

/**
 * @author Aleksey Morozov
 * @since 09.09.2022
 */
public class AlReadyExistException extends HttpException{
    public AlReadyExistException(String message) {
        super(HttpStatus.CONFLICT.value(), message);
    }
}
