package ru.amorozov.mediacontent.delivery.converters.task;


import org.springframework.stereotype.Component;
import ru.amorozov.domain.entities.Task;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.delivery.converters.RestConverter;
import ru.amorozov.mediacontent.delivery.dto.task.TaskRequestDto;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@Component
public class TaskRequestConverter implements RestConverter<TaskRequestDto, Task> {
    /**
     * @deprecated преобразование в сущность не требуется
     */
    @Deprecated(since = "не используется")
    @Override
    public TaskRequestDto toDto(Task entity) {
        return null;
    }

    @Override
    public Task toEntity(TaskRequestDto dto) {
        return new Task(dto.getName(),
                dto.getType(),
                dto.getDescription(),
                dto.getAuthorId(),
                dto.getExecutorId(),
                dto.getDateExpired());
    }
}
