package com.example.blog.service;

import com.example.blog.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
