package com.jpa.springpostgres.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Date: 4/10/2023<br/>
 * Time: 2:14 PM<br/>
 */
@Table(name = "film")
@Entity
public class Film implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "FILM_FILM_ID_GENERATOR", sequenceName = "film_film_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FILM_FILM_ID_GENERATOR")
    @Column(name = "film_id")
    private Long filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private int releaseYear;

    @Column(name = "language_id")
    private Long languageId;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_rate")
    private float rentalRate;

    @Column(name = "length")
    private int length;

    @Column(name = "replacement_cost")
    private float replacementCost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "special_features")
    private String specialFeatures;
    @Column(name = "fulltext", nullable = false)
    private String fulltext;

    @Column(name = "fulltext")
    private String fullText;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id", nullable = false, updatable = false),
            inverseJoinColumns = @JoinColumn(name = "actor_id", nullable = false, updatable = false)
    )
    private Set<Actor> actors = new HashSet<Actor>();

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public float getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(float rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film tag = (Film) o;
        return Objects.equals(filmId, tag.filmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId);
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public String getFulltext() {
        return fulltext;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId + '\'' +
                "title=" + title + '\'' +
                "description=" + description + '\'' +
                "releaseYear=" + releaseYear + '\'' +
                "languageId=" + languageId + '\'' +
                "rentalDuration=" + rentalDuration + '\'' +
                "rentalRate=" + rentalRate + '\'' +
                "length=" + length + '\'' +
                "replacementCost=" + replacementCost + '\'' +
                "rating=" + rating + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                "specialFeatures=" + specialFeatures + '\'' +
                "fulltext=" + fulltext + '\'' +
                '}';
    }
}
