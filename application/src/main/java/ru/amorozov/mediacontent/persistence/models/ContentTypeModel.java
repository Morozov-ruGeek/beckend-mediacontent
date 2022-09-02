package ru.amorozov.mediacontent.persistence.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.entities.ContentType;
import ru.amorozov.domain.entities.enums.Type;

import javax.persistence.*;

/**
 * @author Aleksey Morozov
 * @since 31.08.2022
 */
@Entity
@Table(name = "content_types")
@NoArgsConstructor
@Getter
public final class ContentTypeModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Type type;

    public static ContentTypeModel create(ContentType entity){
        var contentTypeModel = new ContentTypeModel();
        contentTypeModel.type = entity.name();
        return contentTypeModel;
    }
}
