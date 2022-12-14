package ru.amorozov.mediacontent.persistence.converters;

import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.*;
import ru.amorozov.mediacontent.persistence.converters.RepositoryConverter;
import ru.amorozov.mediacontent.persistence.models.TaskModel;

import java.util.stream.Collectors;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Component
public class TaskModelConverter implements RepositoryConverter<TaskModel, Task> {

    @Deprecated(since = "костыль")
    @Override
    public TaskModel toModel(Task entity) {
        return null;
    }

    public TaskModel toModel(Task entity, User author, User executor){
        return TaskModel.create(entity, author, executor);
    }

    @Override
    public Task toEntity(TaskModel model) {
        return new Task(model.getId(),
                model.getName(),
                new ContentType(model.getType().getId(), model.getType().getType()),
                model.getDescription(),
                model.getFiles().stream().map(f -> new File(f.getId(), f.getName(), f.getDateCreated(), f.getFormat(), f.getUrl())).collect(Collectors.toList()),
                model.getAuthor().getId(),
                model.getExecutor().getId(),
                model.getDateCreated(),
                model.getDateExpired(),
                model.getContents().stream().map(c -> new Content (c.getId(),
                        new ContentType(
                                c.getContentType().getId(),
                                c.getContentType().getType()),
                        c.getName(),
                        c.getDateCreated(),
                        new User(c.getAuthor().getId(),
                                c.getAuthor().getName(),
                                c.getAuthor().getEmail(),
                                c.getAuthor().getPassword(),
                                c.getAuthor().getAvatar(),
                                new UserRole(c.getAuthor().getRole().getId(),
                                        c.getAuthor().getRole().getRole())),
                        c.getFormat(),
                        c.getUrl(),
                        c.getPreview())).collect(Collectors.toList()),
                model.getComments().stream().map(c -> new Comment(c.getId(),
                        c.getDate(),
                        new User(c.getUser().getId(),
                                c.getUser().getName(),
                                c.getUser().getEmail(),
                                c.getUser().getPassword(),
                                c.getUser().getAvatar(),
                                new UserRole(c.getUser().getRole().getId(), c.getUser().getRole().getRole())),
                        c.getMessage())).collect(Collectors.toList()),
                new TaskStatus(model.getStatus().getId(), model.getStatus().getStatus()));
    }
}
