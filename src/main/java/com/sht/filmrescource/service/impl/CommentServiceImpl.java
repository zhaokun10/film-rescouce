package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.mapper.CommentMapper;
import com.sht.filmrescource.model.Comment;
import com.sht.filmrescource.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public int insertComment(Comment comment) {
        return commentMapper.insertComment(comment);
    }

    @Override
    public List<Comment> findCommentByFilmId(Long filmId) {
        return commentMapper.findCommentByFilmId(filmId);
    }

    @Override
    public List<Comment> findAllComment() {
        return commentMapper.findAllComment();
    }
}
