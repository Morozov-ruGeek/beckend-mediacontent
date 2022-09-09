package ru.amorozov.mediacontent.delivery.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.amorozov.domain.usecases.file.DeleteFileUseCase;
import ru.amorozov.domain.usecases.file.FindFileByIdUseCase;
import ru.amorozov.domain.usecases.file.SaveFileUseCase;
import ru.amorozov.mediacontent.delivery.converters.file.FileConverter;
import ru.amorozov.mediacontent.delivery.converters.file.FileRequestConverter;

import static ru.amorozov.mediacontent.delivery.DeliveryConstants.*;

/**
 * @author Aleksey Morozov
 * @since 09.09.2022
 */
@RestController
@RequestMapping(APPLICATION_NAME + API_VERSION_1 + RESOURCE_FILE)
@RequiredArgsConstructor
public class FileController {

    private final FindFileByIdUseCase findFileByIdUseCase;
    private final DeleteFileUseCase deleteFileUseCase;
    private final SaveFileUseCase saveFileUseCase;
    private final FileConverter fileConverter;
    private final FileRequestConverter fileRequestConverter;
}
