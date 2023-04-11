package com.jpa.springpostgres.repository;

import com.jpa.springpostgres.domain.FilmCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Integer>, JpaSpecificationExecutor<FilmCategory> {

}