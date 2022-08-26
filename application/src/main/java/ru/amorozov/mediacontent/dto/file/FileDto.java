package ru.amorozov.mediacontent.dto.file;

import lombok.*;
import ru.amorozov.domain.entities.enums.Format;
import ru.amorozov.mediacontent.dto.DataTransferObject;


import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class FileDto  implements DataTransferObject {
    private @Getter int id;
    private @Getter String name;
    private @Getter LocalDateTime dateCreated;
    private @Getter Format format;
    private @Getter String url;
}
