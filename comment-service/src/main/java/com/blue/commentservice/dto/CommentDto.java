package com.blue.commentservice.dto;

import com.blue.commentservice.enums.ParentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private String comment;
    private String userId;
    private ParentType parentType;
    private String parentId;
    private LocalDateTime createdAt;
}
