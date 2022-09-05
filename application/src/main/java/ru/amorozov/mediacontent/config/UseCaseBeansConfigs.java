package ru.amorozov.mediacontent.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.amorozov.domain.usecases.user.*;
import ru.amorozov.mediacontent.persistence.services.UserService;

/**
 * @author Aleksey Morozov
 * @since 30.08.2022
 */
@Configuration
public class UseCaseBeansConfigs {

    private final UserService userService;

    @Autowired
    public UseCaseBeansConfigs(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public CreateUserUseCase createUserUseCase() {
        return new CreateUserUseCase(userService);
    }

    @Bean
    public GetByIdUserUseCase getByIdUserUseCase() {
        return new GetByIdUserUseCase(userService);
    }

    @Bean
    public GetByEmailUseCase getByEmailUseCase() {
        return new GetByEmailUseCase(userService);
    }

    @Bean
    public GetAllUsersUseCase getAllUsersUseCase(){
        return new GetAllUsersUseCase(userService);
    }

    @Bean
    public UpdateUserUseCase updateUserUseCase(){
        return new UpdateUserUseCase(userService);
    }

    @Bean
    public DeleteUserUseCase deleteUserUseCase(){
        return new DeleteUserUseCase(userService);
    }
}
