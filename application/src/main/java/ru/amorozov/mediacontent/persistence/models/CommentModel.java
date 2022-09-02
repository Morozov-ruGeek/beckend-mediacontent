package ru.amorozov.mediacontent.persistence.models;

import lombok.*;
import ru.amorozov.domain.entities.Comment;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Entity
@Table(name = "comments")
@NoArgsConstructor
@Getter
public final class CommentModel implements JpaModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel user;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "message", nullable = false)
    private String message;

    @ManyToOne
    @JoinColumn(name = "task_id")
    @Column(nullable = false)
    private TaskModel task;

    public static CommentModel create(Comment entity){
        var commentModel = new CommentModel();
        commentModel.user = UserModel.create(entity.user());
        commentModel.date = entity.date();
        commentModel.message = entity.message();
        return commentModel;
    }
}
