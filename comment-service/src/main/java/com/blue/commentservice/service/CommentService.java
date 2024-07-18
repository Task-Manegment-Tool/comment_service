package com.blue.commentservice.service;

import com.blue.commentservice.entity.Comment;
import com.blue.commentservice.enums.ParentType;

import java.time.LocalDateTime;
import java.util.List;

public interface CommentService {

    public Comment createComment(String comment, String userId, ParentType parentType, String parentId, LocalDateTime createdAt);
    public List<Comment> getCommentByParentId(ParentType parentType, String parentId);
}
