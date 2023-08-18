package com.bluesoft.inova.service.postService;

import com.bluesoft.inova.DTO.PostDTO;
import com.bluesoft.inova.DTO.PostRequest;
import com.bluesoft.inova.entity.Post;

import java.util.List;

public interface PostService {
    Post savePost(PostDTO clinicDTO);

    List<Post> getTopPosts(PostRequest postRequest);

    List<Post> getUserTopPosts(PostRequest postRequest);

}