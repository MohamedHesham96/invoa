package com.bluesoft.inova.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReviewDTO {
    private Integer id;
    private Integer rate;
    private String comment;
    private Integer postId;
    private Integer userId;
}