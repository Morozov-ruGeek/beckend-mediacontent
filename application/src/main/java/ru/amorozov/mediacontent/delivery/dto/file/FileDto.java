package ru.amorozov.mediacontent.delivery.dto.file;

import lombok.*;
import ru.amorozov.domain.entities.File;
import ru.amorozov.domain.entities.enums.Format;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;


import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class FileDto  implements DataTransferObject {
    private long id;
    private String name;
    private LocalDateTime dateCreated;
    private Format format;
    private String url;

    public static FileDto create(File file){
        var fileDto = new FileDto();
        fileDto.id = file.id();
        fileDto.name = file.name();
        fileDto.dateCreated = file.dateCreated();
        fileDto.format = file.format();
        fileDto.url = file.url();
        return fileDto;
    }
}
