package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.entities.enums.Format;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortResponseDto;


import java.time.LocalDateTime;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class ContentDto  implements DataTransferObject {
    private long id;
    private ContentTypeDto type;
    private String name;
    private LocalDateTime dateCreated;
    private UserShortResponseDto author;
    private Format format;
    private String url;
    private String preview;

    public static ContentDto create(Content content){
        var contentDto = new ContentDto();
        contentDto.id = content.id();
        contentDto.type = ContentTypeDto.create(content.contentType());
        contentDto.name = content.name();
        contentDto.dateCreated = content.dateCreated();
        //todo пересмотреть создание ContentDto
        contentDto.author = content.authorId();
        contentDto.format = content.format();
        contentDto.url = content.url();
        contentDto.preview = content.preview();
        return contentDto;
    }
}
