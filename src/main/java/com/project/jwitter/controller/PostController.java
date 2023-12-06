package com.project.jwitter.controller;

import com.project.jwitter.Post;
import com.project.jwitter.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("all")
    public List<Post> getAllPosts () {
        return postService.getAllPosts();
    }

    @PostMapping("add")
    public String addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

}
