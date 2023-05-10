package com.sht.filmrescource.controller;

import com.sht.filmrescource.entity.Country;
import com.sht.filmrescource.entity.Film;
import com.sht.filmrescource.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    @GetMapping("/filmInformation")
    Film findFilmInfoByFilmId(@RequestParam Long filmId){
        return filmService.findFilmInfoByFilmId(filmId);
    }

    @PostMapping("/file")
    public ResponseEntity<String> uploadFile(@RequestParam(value = "file") MultipartFile file) throws IOException {
        return ResponseEntity.ok(this.filmService.uploadFile(file));
    }

    @PostMapping("/insert")
    public ResponseEntity<Boolean> insert(@RequestBody Film film){
        return ResponseEntity.ok(this.filmService.insert(film));
    }

    @PostMapping("/film/update")
    public ResponseEntity<Boolean> update(@RequestBody Film film){
        return ResponseEntity.ok(this.filmService.update(film));
    }

    @GetMapping("/film/country")
    public ResponseEntity<List<Country>> getAllCountry(){
        return ResponseEntity.ok(this.filmService.getAllCountry());
    }

    @PostMapping("/film/delete")
    public ResponseEntity<Boolean> delete(@RequestBody Long filmId){
        return ResponseEntity.ok(this.filmService.delete(filmId));
    }
}
