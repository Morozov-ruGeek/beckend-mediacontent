package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.entities.ContentType;
import ru.amorozov.domain.entities.enums.Type;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class ContentTypeDto  implements DataTransferObject {
    private long id;
    private Type type;

    public static ContentTypeDto create(ContentType contentType){
        var contentTypeDto = new ContentTypeDto();
        contentTypeDto.id = contentType.id();
        contentTypeDto.type = contentType.name();
        return contentTypeDto;
    }
}
