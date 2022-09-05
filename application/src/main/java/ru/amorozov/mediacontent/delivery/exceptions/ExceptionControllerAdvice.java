package ru.amorozov.mediacontent.delivery.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<Object> handleResourceNotFoundException(NotFoundException e) {
        HttpException exception = new NotFoundException(e.getMessage());
        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }
}
