package com.jpa.springpostgres.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "rental")
public class Rental implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "RENTAL_ID_GENERATOR", sequenceName = "rental_rental_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RENTAL_ID_GENERATOR")
    @Column(name = "rental_id", nullable = false)
    private Long rentalId;

    @Column(name = "rental_date", nullable = false)
    private Date rentalDate;

    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId;

    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "staff_id", nullable = false)
    private Integer staffId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "customer_id", updatable = false, insertable = false)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId + '\'' +
                "rentalDate=" + rentalDate + '\'' +
                "inventoryId=" + inventoryId + '\'' +
                "customerId=" + customerId + '\'' +
                "returnDate=" + returnDate + '\'' +
                "staffId=" + staffId + '\'' +
                "lastUpdate=" + lastUpdate + '\'' +
                '}';
    }
}
