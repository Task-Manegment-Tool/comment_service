package com.blue.commentservice.controller;

import com.blue.commentservice.dto.CommentDto;
import com.blue.commentservice.dto.ErrorDto;
import com.blue.commentservice.entity.Comment;
import com.blue.commentservice.enums.ParentType;
import com.blue.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestBody CommentDto commentDto){
        Comment createdComment = commentService.createComment(
                commentDto.getComment(),
                commentDto.getUserId(),
                commentDto.getParentType(),
                commentDto.getParentId(),
                commentDto.getCreatedAt()
        );
        return ResponseEntity.ok(createdComment);
    }

    @GetMapping("/{parentType}/{parentId}")
    public ResponseEntity<List<Comment>> getCommentByParentId(@PathVariable("parentType") ParentType parentType,
                                                              @PathVariable("parentId") String parentId){
        List<Comment> allComments = commentService.getCommentByParentId(parentType, parentId);

        return new ResponseEntity<>(allComments, HttpStatus.OK);
    }
}
