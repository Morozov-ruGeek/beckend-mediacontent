package ru.amorozov.mediacontent.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.amorozov.domain.usecases.comment.SaveCommentUseCase;
import ru.amorozov.domain.usecases.content.CreateContentUseCase;
import ru.amorozov.domain.usecases.content.DeleteContentUseCase;
import ru.amorozov.domain.usecases.content.FindContentByIdUseCase;
import ru.amorozov.domain.usecases.content.GetAllContentUseCase;
import ru.amorozov.domain.usecases.file.DeleteFileUseCase;
import ru.amorozov.domain.usecases.file.FindFileByIdUseCase;
import ru.amorozov.domain.usecases.file.SaveFileUseCase;
import ru.amorozov.domain.usecases.task.*;
import ru.amorozov.domain.usecases.user.*;
import ru.amorozov.mediacontent.persistence.services.*;

/**
 * @author Aleksey Morozov
 * @since 30.08.2022
 */
@Configuration
public class UseCaseBeansConfigs {

    private final UserService userService;
    private final FileService fileService;
    private final TaskService taskService;
    private final ContentService contentService;
    private final CommentService commentService;

    @Autowired
    public UseCaseBeansConfigs(UserService userService,
                               FileService fileService,
                               TaskService taskService,
                               ContentService contentService,
                               CommentService commentService) {
        this.userService = userService;
        this.fileService = fileService;
        this.taskService = taskService;
        this.contentService = contentService;
        this.commentService = commentService;
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

    @Bean
    public CreateTaskUseCase createTaskUseCase(){
        return new CreateTaskUseCase(taskService);
    }

    @Bean
    public DeleteTaskUseCase deleteTaskUseCase(){
        return new DeleteTaskUseCase(taskService);
    }

    @Bean
    public GetAllTasksUseCase getAllTasksUseCase(){
        return new GetAllTasksUseCase(taskService);
    }

    @Bean
    public GetTaskByIdUseCase getTaskByIdUseCase(){
        return new GetTaskByIdUseCase(taskService);
    }

    @Bean
    public UpdateTaskUseCase updateTaskUseCase(){
        return new UpdateTaskUseCase(taskService);
    }

    @Bean
    public DeleteFileUseCase deleteFileUseCase(){
        return new DeleteFileUseCase(fileService);
    }

    @Bean
    public SaveFileUseCase saveFileUseCase(){
        return new SaveFileUseCase(fileService);
    }

    @Bean
    public FindFileByIdUseCase findFileByIdUseCase(){
        return new FindFileByIdUseCase(fileService);
    }

    @Bean
    public FindContentByIdUseCase findContentByIdUseCase(){
        return new FindContentByIdUseCase(contentService);
    }

    @Bean
    public GetAllContentUseCase getAllContentUseCase(){
        return new GetAllContentUseCase(contentService);
    }

    @Bean
    public CreateContentUseCase createContentUseCase(){
        return new CreateContentUseCase(contentService);
    }

    @Bean
    public DeleteContentUseCase deleteContentUseCase(){
        return new DeleteContentUseCase(contentService);
    }

    @Bean
    public SaveCommentUseCase saveCommentUseCase(){
        return new SaveCommentUseCase(commentService);
    }
}
