package ru.amorozov.mediacontent.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
@Setter
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
    @Column(nullable = false)
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
    @Column
    private TaskModel task;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public static ContentModel create(Content entity){
        var contentModel = new ContentModel();
        contentModel.setContentType(ContentTypeModel.create(entity.contentType()));
        contentModel.setName(entity.name());
        contentModel.setDateCreated(entity.dateCreated());
        contentModel.setAuthor(UserModel.create(entity.author()));
        contentModel.setFormat(entity.format());
        contentModel.setUrl(entity.url());
        contentModel.setPreview(entity.preview());
        return contentModel;
    }
}
