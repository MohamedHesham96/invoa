package com.bluesoft.inova.service.postService;

import com.bluesoft.inova.DTO.PostDTO;
import com.bluesoft.inova.DTO.ReviewDTO;
import com.bluesoft.inova.entity.Post;
import com.bluesoft.inova.entity.Review;

public interface ReviewService {
    Review saveReview(ReviewDTO reviewDTO);
}