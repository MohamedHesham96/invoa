package com.bluesoft.inova.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostRequest {
    private Integer userId;
    private Integer page;
    private Integer count;
}