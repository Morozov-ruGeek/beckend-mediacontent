package ru.amorozov.mediacontent.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.amorozov.domain.entities.TaskStatus;
import ru.amorozov.domain.entities.enums.Status;

import javax.persistence.*;

/**
 * @author Aleksey Morozov
 * @since 01.09.2022
 */
@Entity
@Table(name = "statuses")
@NoArgsConstructor
@Getter
public final class TaskStatusModel implements JpaModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public static TaskStatusModel create(TaskStatus entity){
        var taskStatusModel = new TaskStatusModel();
        taskStatusModel.status = entity.status();
        return taskStatusModel;
    }
}
