package com.sht.filmrescource.service.impl;

import com.sht.filmrescource.entity.Country;
import com.sht.filmrescource.mapper.FilmMapper;
import com.sht.filmrescource.entity.Film;
import com.sht.filmrescource.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
    @Override
    public Film findFilmInfoByFilmId(Long filmId) {
        return filmMapper.findFilmByFilmId(filmId);
    }

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        String fileName =  file.getOriginalFilename();
        // 存储的静态文件的路径（绝对路径）
        File destFile = new File("/Users/zhaokun/IdeaProjects/film-rescouce/src/main/resources/static" + "/" + fileName);
        // 创建目标文件的存储路径
        destFile.getParentFile().mkdirs();
        // 上传的图片文件转化为目标文件
        file.transferTo(destFile);
        return  fileName;
    }

    @Override
    public Boolean insert(Film film) {
        return filmMapper.insert(film)>0;
    }

    @Override
    public Boolean update(Film film) {
        return filmMapper.updateFilm(film);
    }

    @Override
    public List<Country> getAllCountry() {
        return filmMapper.getAllCountry();
    }

    @Override
    public Boolean delete(Long filmId) {
        return filmMapper.delete(filmId)>0;
    }
}
