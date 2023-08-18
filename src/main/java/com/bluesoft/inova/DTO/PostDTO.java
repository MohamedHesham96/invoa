package com.bluesoft.inova.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostDTO {

    private Integer id;
    private Integer userId;
    private String title;
    private String body;
}