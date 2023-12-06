package com.project.jwitter.service;

import com.project.jwitter.Post;
import com.project.jwitter.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostDao postDao;
    public List<Post> getAllPosts() {
        return postDao.findAll();
    }
    public String addPost(Post post) {
        postDao.save(post);
        return "success";
    }
}