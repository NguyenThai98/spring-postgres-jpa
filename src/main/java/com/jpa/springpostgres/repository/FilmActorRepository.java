package com.jpa.springpostgres.repository;

import com.jpa.springpostgres.domain.FilmActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmActorRepository extends JpaRepository<FilmActor, Integer>, JpaSpecificationExecutor<FilmActor> {

}