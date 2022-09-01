package ru.amorozov.mediacontent.delivery.dto.content;

import lombok.*;
import ru.amorozov.domain.entities.enums.Format;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;
import ru.amorozov.mediacontent.delivery.dto.user.UserShortRequestDto;


import java.time.LocalDateTime;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class ContentDto  implements DataTransferObject {
    private @Getter int id;
    private @Getter ContentTypeDto type;
    private @Getter String name;
    private @Getter LocalDateTime dateCreated;
    private @Getter UserShortRequestDto author;
    private @Getter Format format;
    private @Getter String url;
    private @Getter String preview;
}
