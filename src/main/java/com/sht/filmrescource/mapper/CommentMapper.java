package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Comment;

import java.util.List;

public interface CommentMapper {

   int insertComment(Comment comment);

   List<Comment> findCommentByFilmId(Long filmId);

    List<Comment> findAllComment();

    int deleteComment(Long commentId);
}
