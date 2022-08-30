package ru.amorozov.mediacontent.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.mediacontent.repositories.UserRepository;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}
