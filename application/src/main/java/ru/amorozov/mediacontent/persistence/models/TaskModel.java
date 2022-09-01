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
@Setter
public final class TaskModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "content_type_id")
    @Column(nullable = false)
    private ContentTypeModel type;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "task")
    @Column(nullable = false)
    private Collection<FileModel> files;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(nullable = false)
    private UserModel author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(nullable = false)
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
    @Column(nullable = false)
    private TaskStatusModel status;

    public static TaskModel create(Task entity){
        var taskModel = new TaskModel();
        taskModel.setName(entity.name());
        taskModel.setType(ContentTypeModel.create(entity.type()));
        taskModel.setDescription(entity.description());
        taskModel.setFiles(entity.files().stream().map(FileModel::create).collect(Collectors.toList()));
        taskModel.setAuthor(UserModel.create(entity.author()));
        taskModel.setExecutor(UserModel.create(entity.executor()));
        taskModel.setDateExpired(entity.dateExpired());
        taskModel.setContents(entity.contents().stream().map(ContentModel::create).collect(Collectors.toList()));
        taskModel.setComments(entity.comments().stream().map(CommentModel::create).collect(Collectors.toList()));
        taskModel.setStatus(TaskStatusModel.create(entity.status()));
        return taskModel;
    }
}