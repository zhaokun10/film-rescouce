package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Comment;

import java.util.List;

public interface CommentService {

    int insertComment(Comment comment);

    List<Comment> findCommentByFilmId(Long filmId);

    List<Comment> findAllComment();

    Boolean deleteComment(Long commentId);
}
