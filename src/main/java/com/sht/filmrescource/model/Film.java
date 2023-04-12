package com.sht.filmrescource.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    private Long filmId;

    private String filmName;

    private String filmUrl;

    private double filmRating;

    private Long showTime;

    private Long isHot;

    private String profile;
}
