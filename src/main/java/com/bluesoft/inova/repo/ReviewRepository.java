package com.bluesoft.inova.repo;

import com.bluesoft.inova.entity.Post;
import com.bluesoft.inova.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}