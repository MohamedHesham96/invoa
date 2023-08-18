package com.bluesoft.inova.controller;

import com.bluesoft.inova.DTO.ReviewDTO;
import com.bluesoft.inova.DefaultResponse;
import com.bluesoft.inova.entity.Review;
import com.bluesoft.inova.service.postService.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<?> createReview(@RequestBody ReviewDTO reviewDTO) {
        try {
            Review savedReview = reviewService.saveReview(reviewDTO);
            return ResponseEntity.ok(savedReview.getId());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new DefaultResponse("Error Occurred, please contract admin"));
        }
    }
}