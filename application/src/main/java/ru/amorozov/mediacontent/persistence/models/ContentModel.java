package ru.amorozov.mediacontent.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.entities.enums.Format;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Entity
@Table(name = "contents")
@NoArgsConstructor
@Getter
public final class ContentModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "content_type_id", nullable = false)
    private ContentTypeModel contentType;

    @Column(nullable = false)
    private String name;

    @CreationTimestamp
    @Column(name = "create_date", nullable = false)
    private LocalDateTime dateCreated;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel author;

    @Enumerated(EnumType.STRING)
    @Column(name = "content_format", nullable = false)
    private Format format;

    @Column(nullable = false, unique = true)
    private String url;

    @Column(nullable = false)
    private String preview;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private TaskModel task;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public static ContentModel create(Content entity){
        var contentModel = new ContentModel();
        contentModel.contentType = ContentTypeModel.create(entity.contentType());
        contentModel.name = entity.name();
        contentModel.dateCreated = entity.dateCreated();
        contentModel.author = UserModel.create(entity.authorId());
        contentModel.format = entity.format();
        contentModel.url = entity.url();
        contentModel.preview = entity.preview();
        return contentModel;
    }
}
