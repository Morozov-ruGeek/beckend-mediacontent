package ru.amorozov.mediacontent.delivery.converters.task;


import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.*;

import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.converters.file.FileConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class TaskConverter implements RestConverter<TaskDto, Task> {
    @Override
    public TaskDto toDto(Task entity) {
        return TaskDto.create(entity);
    }

    @Override
    public Task toEntity(TaskDto dto) {
        return new Task(dto.getName(),
                new ContentType(dto.getType().getId(), dto.getType().getType()),
                dto.getDescription(),
                dto.getAuthorId(),
                dto.getExecutorId(),
                dto.getDateExpired());
    }
    public Task toFullEntity(TaskDto dto) {
        return new Task(dto.getId(),
                dto.getName(),
                new ContentType(dto.getType().getId(), dto.getType().getType()),
                dto.getDescription(),
                dto.getFiles().stream()
                        .map(fileDto -> new File(fileDto.getId(),
                                fileDto.getName(),
                                fileDto.getDateCreated(),
                                fileDto.getFormat(),
                                fileDto.getUrl()))
                        .toList(),
                dto.getAuthorId(),
                dto.getExecutorId(),
                dto.getDateCreated(),
                dto.getDateExpired(),
                dto.getContents().stream()
                        .map(contentDto -> new Content(contentDto.getId(),
                                new ContentType(contentDto.getType().getId(), contentDto.getType().getType()),
                                contentDto.getName(),
                                contentDto.getDateCreated(),
                                contentDto.getAuthor().getId(),
                                contentDto.getFormat(),
                                contentDto.getUrl(),
                                contentDto.getPreview()))
                        .toList(),
                dto.getComments().stream()
                        .map(commentDto -> new Comment(commentDto.getId(),
                                commentDto.getDate(),
                                new User(commentDto.getUser().getId(), commentDto.getUser().getName()),
                                commentDto.getMessage()))
                        .toList(),
                new TaskStatus(dto.getStatus().getId(), dto.getStatus().getStatus()));
    }
}
