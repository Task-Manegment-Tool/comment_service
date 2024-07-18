package com.blue.commentservice.repository;

import com.blue.commentservice.entity.Comment;
import com.blue.commentservice.enums.ParentType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, Long> {
    public List<Comment> findCommentsByParentTypeAndParentId(ParentType parentType, String parentId);
}
