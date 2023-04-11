package com.jpa.springpostgres.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "film_category")
public class FilmCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Id
    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "FilmCategory{" +
                "filmId=" + filmId + '\'' +
                "categoryId=" + categoryId + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
