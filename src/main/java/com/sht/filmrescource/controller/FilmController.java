package com.sht.filmrescource.controller;

import com.sht.filmrescource.model.Film;
import com.sht.filmrescource.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/hot")
    List<Film> findHotFilm(){
        return filmService.findHotFilm();
    }

    @GetMapping("/new")
    List<Film> findNewFilm(){
        return filmService.findNewFilm();
    }


    @GetMapping("/newHot")
    List<Film> findNewHotFilm(){
        return filmService.findNewHotFilm();
    }

    @GetMapping("/all")
    List<Film> findAllFilm(){
        return filmService.findAllFilm();
    }
    @GetMapping("/lunBo")
    List<Film> findLunBoFilm(){
        return filmService.findLunBoFilm();
    }
    @GetMapping("/allHot")
    List<Film> findAllHotFilm(){
        return filmService.findAllHotFilm();
    }
    @GetMapping("/allRecommended")
    List<Film> findAllRecommendedFilm(){
        return filmService.findAllRecommendedFilm();
    }

    @GetMapping("/search")
    List<Film> searchFilm(@RequestParam String searchInfo) throws UnsupportedEncodingException {
        return filmService.searchFilm(searchInfo);
    }

    @GetMapping("/filmInfo")
    Film findFilmByFilmId(@RequestParam Long filmId){
        return filmService.findFilmByFilmId(filmId);
    }
}
