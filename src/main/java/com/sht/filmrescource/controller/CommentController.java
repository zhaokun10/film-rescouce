package com.sht.filmrescource.controller;

import com.sht.filmrescource.model.Comment;
import com.sht.filmrescource.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
