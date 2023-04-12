package com.sht.filmrescource.service;

import com.sht.filmrescource.model.Film;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface FilmService {

    List<Film> findHotFilm();

    List<Film> findNewFilm();

    List<Film> findNewHotFilm();

    List<Film> findAllFilm();

    List<Film> findLunBoFilm();

    List<Film> findAllHotFilm();

    List<Film> findAllRecommendedFilm();

    List<Film> searchFilm(String searchInfo) throws UnsupportedEncodingException;

    Film findFilmByFilmId(Long filmId);
}
