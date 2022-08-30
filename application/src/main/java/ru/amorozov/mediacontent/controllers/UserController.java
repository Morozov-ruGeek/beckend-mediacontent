package ru.amorozov.mediacontent.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.amorozov.mediacontent.services.UserService;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
}
