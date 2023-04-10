package com.jpa.springpostgres.controller;

import com.jpa.springpostgres.domain.Actor;
import com.jpa.springpostgres.domain.Film;
import com.jpa.springpostgres.service.ActorService;
import com.jpa.springpostgres.service.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Date: 4/10/2023<br/>
 * Time: 3:22 PM<br/>
 */
@RestController
@RequestMapping("/api/film")
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping()
    public Map<String, List<Film>> getActors() {
        return Collections.singletonMap("films", this.filmService.getFilmList());
    }

    @GetMapping(value="/{id}")
    public Map<String, Film> getActor(@PathVariable("id") Long id) {
        return Collections.singletonMap("film", this.filmService.getFilm(id));
    }

    @GetMapping("/count")
    public Map<String, Long> countActors() {
        return Collections.singletonMap("countFilms", this.filmService.countFilms());
    }
}
