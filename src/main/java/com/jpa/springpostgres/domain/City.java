package com.jpa.springpostgres.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "city")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "city_id", nullable = false)
    private Long cityId;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;


    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId + '\'' +
                "city=" + city + '\'' +
                "countryId=" + countryId + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
