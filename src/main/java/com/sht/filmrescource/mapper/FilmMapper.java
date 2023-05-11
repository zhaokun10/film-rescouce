package com.sht.filmrescource.mapper;

import com.sht.filmrescource.entity.Country;
import com.sht.filmrescource.entity.Film;

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
   Film findFilmInfoByFilmId(Long filmId);

   void updateImage(String fileName, Long filmId);

   int insert(Film film);

   Boolean updateFilm(Film film);

   List<Country> getAllCountry();

   int delete(Long filmId);

   int addFilmActorDuties(Long filmId, Long actorId, Long dutiesId);
}
