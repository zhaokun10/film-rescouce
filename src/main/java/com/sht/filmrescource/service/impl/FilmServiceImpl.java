package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.mapper.FilmMapper;
import com.sht.filmrescource.model.Film;
import com.sht.filmrescource.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmMapper filmMapper;
    @Override
    public List<Film> findHotFilm() {
        return filmMapper.findHotFilm();
    }

    @Override
    public List<Film> findNewFilm() {
        return filmMapper.findNewFilm();
    }

    @Override
    public List<Film> findNewHotFilm() {
        return filmMapper.findNewHotFilm();
    }

    @Override
    public List<Film> findAllFilm() {
        return filmMapper.findAllFilm();
    }

    @Override
    public List<Film> findLunBoFilm() {
        return filmMapper.findLunBoFilm();
    }

    @Override
    public List<Film> findAllHotFilm() {
        return filmMapper.findAllHotFilm();
    }

    @Override
    public List<Film> findAllRecommendedFilm() {
        return filmMapper.findAllRecommendedFilm();
    }

    @Override
    public List<Film> searchFilm(String searchInfo) throws UnsupportedEncodingException {
        return filmMapper.searchFilm(searchInfo);
    }

    @Override
    public Film findFilmByFilmId(Long filmId) {
        return filmMapper.findFilmByFilmId(filmId);
    }
}
