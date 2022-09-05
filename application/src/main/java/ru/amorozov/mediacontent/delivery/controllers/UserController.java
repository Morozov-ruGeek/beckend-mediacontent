package ru.amorozov.mediacontent.delivery.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.domain.failure.CoreFailures;
import ru.amorozov.domain.usecases.user.*;
import ru.amorozov.mediacontent.delivery.converters.user.UserConverter;
import ru.amorozov.mediacontent.delivery.converters.user.UserRequestConverter;
import ru.amorozov.mediacontent.delivery.dto.user.UserRequestDto;
import ru.amorozov.mediacontent.delivery.dto.user.UserResponseDto;
import ru.amorozov.mediacontent.delivery.exceptions.NotFoundException;

import javax.validation.Valid;
import java.util.Collection;
import java.util.stream.Collectors;

import static ru.amorozov.mediacontent.delivery.DeliveryConstants.*;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
@RestController
@RequestMapping(APPLICATION_NAME + API_VERSION_1 + RESOURCE_USER)
@RequiredArgsConstructor
public class UserController {

    private final UserConverter userConverter;
    private final UserRequestConverter userRequestConverter;
    private final CreateUserUseCase createUserUseCase;
    private final GetByIdUserUseCase getByIdUserUseCase;
    private final GetByEmailUseCase getByEmailUseCase;
    private final GetAllUsersUseCase getAllUsersUseCase;

    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;


    @PostMapping
    public UserResponseDto create(@RequestBody @Valid UserRequestDto userRequest) {
        var userEntity = userRequestConverter.toEntity(userRequest);
        var result = createUserUseCase.execute(userEntity);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.EmailAlreadyExist) {
            throw new NotFoundException("Такой пользователь уже существует");
        }
        return userConverter.toDto(result.get());
    }

    @GetMapping
    public Collection<UserResponseDto> getAll() {
        var result = getAllUsersUseCase.execute(null);
        return result.get().stream().map(userConverter::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserResponseDto getById(@PathVariable Long id) {
        var result = getByIdUserUseCase.execute(id);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Пользователь с id=%d не найден", id));
        }
        return userConverter.toDto(result.get());
    }

    @PostMapping()
    public UserResponseDto getByEmail(@Valid @RequestBody String email) {
        var result = getByEmailUseCase.execute(email);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Пользователь с e-mail: %s, не найден", email));
        }
        return userConverter.toDto(result.get());
    }

    @PutMapping
    public void update(@Valid @RequestBody UserRequestDto user) {
        var userEntity = userRequestConverter.toEntity(user);
        var result = updateUserUseCase.execute(userEntity);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Пользователь с e-mail: %s, не найден", user.getEmail()));
        }
    }

    @PostMapping("/{id}")
    public void deleteById(@Valid @RequestBody String email) {
        var result = deleteUserUseCase.execute(email);
        if (result.isLeft() && result.getLeft() instanceof CoreFailures.NotFound) {
            throw new NotFoundException(String.format("Пользователь с e-mail: %s, не найден", email));
        }
    }
}
