package com.sht.filmrescource.service;

import com.sht.filmrescource.model.Comment;

import java.util.List;

public interface CommentService {

    int insertComment(Comment comment);

    List<Comment> findCommentByFilmId(Long filmId);

    List<Comment> findAllComment();
}
