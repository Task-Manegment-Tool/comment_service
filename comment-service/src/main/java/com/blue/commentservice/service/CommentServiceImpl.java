package com.blue.commentservice.service;

import com.blue.commentservice.entity.Comment;
import com.blue.commentservice.enums.ParentType;
import com.blue.commentservice.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment createComment(String comment, String userId, ParentType parentType, String parentId, LocalDateTime createdAt) {
        Comment newComment = new Comment();
        newComment.setComment(comment);
        newComment.setUserId(userId);
        newComment.setParentType(parentType);
        newComment.setParentId(parentId);
        newComment.setCreatedAt(LocalDateTime.now());

        return commentRepository.save(newComment);
    }

    @Override
    public List<Comment> getCommentByParentId(ParentType parentType, String parentId) {
        return commentRepository.findCommentsByParentTypeAndParentId(parentType, parentId);
    }
}
