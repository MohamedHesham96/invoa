package com.bluesoft.inova.service.postService;

import com.bluesoft.inova.DTO.PostDTO;
import com.bluesoft.inova.DTO.PostRequest;
import com.bluesoft.inova.entity.Post;
import com.bluesoft.inova.entity.User;
import com.bluesoft.inova.repo.PostRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post savePost(PostDTO postDTO) {
        Post post = new Post();
        BeanUtils.copyProperties(postDTO, post);
        post.setUser(new User(postDTO.getUserId()));
        return postRepository.save(post);
    }

    @Override
    public List<Post> getTopPosts(PostRequest postRequest) {
        return postRepository.findAll(PageRequest.of(postRequest.getPage(), postRequest.getCount(), Sort.by("id").descending())).getContent();

    }

    @Override
    public List<Post> getUserTopPosts(PostRequest postRequest) {
        return postRepository.findByUserIdEquals(postRequest.getUserId(), PageRequest.of(postRequest.getPage(), postRequest.getCount(),
                Sort.by("id").descending())).getContent();

    }
}