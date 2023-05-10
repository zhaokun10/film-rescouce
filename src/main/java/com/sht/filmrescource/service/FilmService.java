package com.sht.filmrescource.service;

import com.sht.filmrescource.entity.Country;
import com.sht.filmrescource.entity.Film;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    Film findFilmInfoByFilmId(Long filmId);

    String uploadFile(MultipartFile file) throws IOException;

    Boolean insert(Film film);

    Boolean update(Film film);

    List<Country> getAllCountry();

    Boolean delete(Long filmId);
}
