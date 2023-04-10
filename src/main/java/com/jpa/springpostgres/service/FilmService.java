package com.jpa.springpostgres.service;

import com.jpa.springpostgres.domain.Actor;
import com.jpa.springpostgres.domain.Film;
import com.jpa.springpostgres.exception.InternalServerError;
import com.jpa.springpostgres.repository.ActorRepository;
import com.jpa.springpostgres.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Date: 4/10/2023<br/>
 * Time: 3:19 PM<br/>
 */
@Service
public class FilmService {
    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getFilmList() {
        List<Film> filmEntities;

        try {
            filmEntities = this.filmRepository.findAll();
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return filmEntities;
    }

    public Long countFilms() {
        Long countAllActor;

        try {
            countAllActor = this.filmRepository.count();
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return countAllActor;
    }

    public Film getFilm(Long actorId) {
        Film film;

        try {
            film = this.filmRepository.findByFilmId(actorId);
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return film;
    }
}
