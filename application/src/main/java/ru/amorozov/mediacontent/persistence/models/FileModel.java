package ru.amorozov.mediacontent.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import ru.amorozov.domain.entities.File;
import ru.amorozov.domain.entities.enums.Format;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Entity
@Table(name = "files")
@NoArgsConstructor
@Getter
@Setter
public final class FileModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime dateCreated;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Format format;

    @Column(nullable = false)
    private String url;

    @ManyToOne
    @JoinColumn(name = "task_id")
    @Column
    private TaskModel task;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public static FileModel create(File entity) {
        var fileModel = new FileModel();
        fileModel.setName(entity.name());
        fileModel.setDateCreated(entity.dateCreated());
        fileModel.setFormat(entity.format());
        fileModel.setUrl(entity.url());
        return fileModel;
    }
}
