package com.blogapi.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private long id;

    @NotEmpty(message = "Title is Empty")
    @Size(min = 2,message = "Title should atleast 2 characters")
    private String title;

    @NotEmpty(message = "Description is Empty")
    @Size(min = 4,message = "Description should atleast 4 characters")
    private String description;

    @NotEmpty
    private String content;
}
