package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Comment;
import com.sht.filmrescource.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/add")
    int insertComment(@RequestBody Comment comment){
        return commentService.insertComment(comment);
    }
    @GetMapping("/filmComment")
    List<Comment> findCommentByFilmId(@RequestParam Long filmId){
        return commentService.findCommentByFilmId(filmId);
    }
    @GetMapping("/all")
    List<Comment> findAllComment(){
        return commentService.findAllComment();
    }

    @PostMapping("/delete")
    ResponseEntity<Boolean> deleteComment(@RequestBody Long commentId){
        return ResponseEntity.ok(commentService.deleteComment(commentId));
    }
}
