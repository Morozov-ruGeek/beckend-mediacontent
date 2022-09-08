package ru.amorozov.mediacontent.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.Content;
import ru.amorozov.domain.repositories.ContentRepositoryService;
import ru.amorozov.mediacontent.persistence.converters.ContentModelConverter;
import ru.amorozov.mediacontent.persistence.repositories.ContentRepository;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
@Service
public class ContentService implements ContentRepositoryService {

    private final ContentRepository contentRepository;
    private final ContentModelConverter contentConverter;

    @Autowired
    public ContentService(ContentRepository contentRepository,
                          ContentModelConverter contentConverter) {
        this.contentRepository = contentRepository;
        this.contentConverter = contentConverter;
    }

    @Override
    public Optional<Content> findById(long id) {
        var contentModel = contentRepository.findById(id);
        return Optional.of(contentConverter.toEntity(contentModel.get()));
    }

    @Override
    public Collection<Content> getAll() {
        return contentRepository.findAll().stream().map(contentConverter::toEntity).toList();
    }

    @Override
    public Content save(Content content) {
        var contentModel = contentConverter.toModel(content);
        return contentConverter.toEntity(contentRepository.save(contentModel));
    }

    @Override
    public void delete(long id) {
        contentRepository.deleteById(id);
    }
}
