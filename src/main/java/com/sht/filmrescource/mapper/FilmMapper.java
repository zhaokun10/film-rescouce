package com.sht.filmrescource.mapper;

import com.sht.filmrescource.model.Film;

import java.util.List;

public interface FilmMapper {

   List<Film> findHotFilm();

   List<Film> findNewFilm();

   List<Film> findNewHotFilm();

   List<Film> findLunBoFilm();

   List<Film> findAllFilm();

   List<Film> findAllHotFilm();

   List<Film> findAllRecommendedFilm();

   List<Film> searchFilm(String searchInfo);

   Film findFilmByFilmId(Long filmId);
}
