package com.bluesoft.inova.repo;

import com.bluesoft.inova.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Integer>, JpaRepository<Post, Integer> {

    @Override
    Page<Post> findAll(Pageable pageable);

    Page<Post> findByUserIdEquals(Integer userId, Pageable pageable);

}