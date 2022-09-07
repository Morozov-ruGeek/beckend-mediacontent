package ru.amorozov.mediacontent.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import ru.amorozov.domain.entities.Task;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Entity
@Table(name = "tasks")
@NoArgsConstructor
@Getter
public final class TaskModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "content_type_id")
    private ContentTypeModel type;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "task")
    @Column(nullable = false)
    private Collection<FileModel> files;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserModel author;

    @ManyToOne
    @JoinColumn(name = "executor_id")
    private UserModel executor;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime dateCreated;

    @Column
    private LocalDateTime dateExpired;

    @OneToMany(mappedBy = "task")
    @Column(nullable = false)
    private Collection<ContentModel> contents;

    @OneToMany(mappedBy = "task")
    @Column
    private Collection<CommentModel> comments;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private TaskStatusModel status;

    public static TaskModel create(Task entity){
        var taskModel = new TaskModel();
        taskModel.name = entity.name();
        taskModel.type = ContentTypeModel.create(entity.type());
        taskModel.description = entity.description();
        taskModel.files = entity.files().stream().map(FileModel::create).collect(Collectors.toList());
        taskModel.author = UserModel.create(entity.author());
        taskModel.executor = UserModel.create(entity.executor());
        taskModel.dateExpired = entity.dateExpired();
        taskModel.contents = entity.contents().stream().map(ContentModel::create).collect(Collectors.toList());
        taskModel.comments = entity.comments().stream().map(CommentModel::create).collect(Collectors.toList());
        taskModel.status = TaskStatusModel.create(entity.status());
        return taskModel;
    }
}
