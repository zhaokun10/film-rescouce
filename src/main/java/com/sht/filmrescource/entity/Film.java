package com.sht.filmrescource.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (Film)实体类
 *
 * @author makejava
 * @since 2023-05-10 08:16:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {
    private static final long serialVersionUID = -91405211574686236L;
    
    private Long filmId;
    
    private String filmName;
    
    private String filmUrl;
    
    private Double filmRating;
    
    private Long showTime;
    
    private Long isHot;
    
    private String profile;
    
    private Long country;
    
    private String type;

    private Country countryString;

    private List<Actor> actorList;

    public Country getCountryString() {
        return countryString;
    }

    public void setCountryString(Country countryString) {
        this.countryString = countryString;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmUrl() {
        return filmUrl;
    }

    public void setFilmUrl(String filmUrl) {
        this.filmUrl = filmUrl;
    }

    public Double getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(Double filmRating) {
        this.filmRating = filmRating;
    }

    public Long getShowTime() {
        return showTime;
    }

    public void setShowTime(Long showTime) {
        this.showTime = showTime;
    }

    public Long getIsHot() {
        return isHot;
    }

    public void setIsHot(Long isHot) {
        this.isHot = isHot;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

