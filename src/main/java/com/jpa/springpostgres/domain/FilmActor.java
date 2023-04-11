package com.jpa.springpostgres.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "film_actor")
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "actor_id", nullable = false)
    private Integer actorId;

    @Id
    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "FilmActor{" +
                "actorId=" + actorId + '\'' +
                "filmId=" + filmId + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
