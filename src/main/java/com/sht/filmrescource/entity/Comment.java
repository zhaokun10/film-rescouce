package com.sht.filmrescource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Long commentId;
    private Long userId;
    private Long filmId;
    private String content;
    private Double rating;
    private Timestamp time;
    private User user;
    private Film film;
}
