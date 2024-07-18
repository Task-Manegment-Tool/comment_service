package com.blue.commentservice.entity;

import com.blue.commentservice.enums.ParentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("User-Comments")
public class Comment {

    @Id
    private String id;
    private String comment;
    private String userId;
    private ParentType parentType;
    private String parentId;
    private LocalDateTime createdAt;
}
