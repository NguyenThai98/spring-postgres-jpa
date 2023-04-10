package com.jpa.springpostgres.repository;

import com.jpa.springpostgres.domain.Actor;
import com.jpa.springpostgres.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Date: 4/10/2023<br/>
 * Time: 2:56 PM<br/>
 */
@Repository
public interface FilmRepository extends JpaRepository<Film,Long>, CrudRepository<Film, Long> {
    Film findByFilmId(Long id);
}
