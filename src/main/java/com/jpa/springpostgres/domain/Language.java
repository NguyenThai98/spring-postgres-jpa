package com.jpa.springpostgres.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "language")
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "LANGUAGE_ID_GENERATOR", sequenceName = "language_language_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LANGUAGE_ID_GENERATOR")
    @Column(name = "language_id", nullable = false)
    private Long languageId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId + '\'' +
                "name=" + name + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
