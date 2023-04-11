package com.jpa.springpostgres.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "store")
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "STORE_ID_GENERATOR", sequenceName = "store_store_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STORE_ID_GENERATOR")
    @Column(name = "store_id", nullable = false)
    private Long storeId;

    @Column(name = "manager_staff_id", nullable = false)
    private Integer managerStaffId;

    @Column(name = "address_id", nullable = false)
    private Integer addressId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setManagerStaffId(Integer managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Integer getManagerStaffId() {
        return managerStaffId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId + '\'' +
                "managerStaffId=" + managerStaffId + '\'' +
                "addressId=" + addressId + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
