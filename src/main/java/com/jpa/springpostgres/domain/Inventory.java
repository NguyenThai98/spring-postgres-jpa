package com.jpa.springpostgres.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "INVENTORY_ID_GENERATOR", sequenceName = "inventory_inventory_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INVENTORY_ID_GENERATOR")
    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId ;

    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "store_id", nullable = false)
    private Integer storeId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId + '\'' +
                "filmId=" + filmId + '\'' +
                "storeId=" + storeId + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
