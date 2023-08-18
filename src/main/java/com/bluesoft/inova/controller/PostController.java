package com.bluesoft.inova.controller;

import com.bluesoft.inova.DTO.PostDTO;
import com.bluesoft.inova.DTO.PostRequest;
import com.bluesoft.inova.DefaultResponse;
import com.bluesoft.inova.entity.Post;
import com.bluesoft.inova.service.postService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody PostDTO postDTO) {
        try {
            Post savedPost = postService.savePost(postDTO);
            return ResponseEntity.ok(savedPost.getId());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new DefaultResponse("Error Occurred, please contract admin"));
        }
    }

    @GetMapping
    public ResponseEntity<?> getTopPosts(@RequestBody PostRequest postRequest) {
        try {
            List<Post> postsList = postService.getTopPosts(postRequest);
            return ResponseEntity.ok(postsList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new DefaultResponse("Error Occurred, please contract admin"));
        }
    }

    @GetMapping("/user")
    public ResponseEntity<?> getUserTopPosts(@RequestBody PostRequest postRequest) {
        try {
            List<Post> postsList = postService.getUserTopPosts(postRequest);
            return ResponseEntity.ok(postsList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new DefaultResponse("Error Occurred, please contract admin"));
        }
    }
}