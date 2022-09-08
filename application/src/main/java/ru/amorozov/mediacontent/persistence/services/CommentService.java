package ru.amorozov.mediacontent.persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.domain.entities.Comment;
import ru.amorozov.domain.repositories.CommentRepositoryService;
import ru.amorozov.mediacontent.persistence.converters.CommentModelConverter;
import ru.amorozov.mediacontent.persistence.repositories.CommentRepository;

/**
 * @author Aleksey Morozov
 * @since 08.09.2022
 */
@Service
public class CommentService implements CommentRepositoryService {

    private final CommentRepository commentRepository;
    private final CommentModelConverter commentConverter;

    @Autowired
    public CommentService(CommentRepository commentRepository,
                          CommentModelConverter commentConverter) {
        this.commentRepository = commentRepository;
        this.commentConverter = commentConverter;
    }

    @Override
    public Comment save(Comment comment) {
        var commentModel = commentConverter.toModel(comment);
        return commentConverter.toEntity(commentRepository.save(commentModel));
    }
}
