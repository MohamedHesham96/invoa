package com.bluesoft.inova.service.reviewService;

import com.bluesoft.inova.DTO.ReviewDTO;
import com.bluesoft.inova.entity.Post;
import com.bluesoft.inova.entity.Review;
import com.bluesoft.inova.entity.User;
import com.bluesoft.inova.repo.ReviewRepository;
import com.bluesoft.inova.service.postService.ReviewService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public Review saveReview(ReviewDTO reviewDTO) {
        Review review = new Review();
        BeanUtils.copyProperties(reviewDTO, review);
        review.setUser(new User(reviewDTO.getUserId()));
        review.setPost(new Post(reviewDTO.getPostId()));
        return reviewRepository.save(review);
    }


}