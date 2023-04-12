package com.jpa.springpostgres.model;

import java.util.Date;
import java.util.Set;

/**
 * Date: 4/11/2023<br/>
 * Time: 11:11 AM<br/>
 */
public class CustomerModel {

    private String firstName   ;

    private String lastName    ;

    private String email       ;

    private boolean activebool  ;

    private Date createDate  ;

    private Date lastUpdate  ;

    private int active      ;

    private AddressModel address;

    private Set<PaymentModel> payments;

    public Set<PaymentModel> getPayments() {
        return payments;
    }

    public void setPayments(Set<PaymentModel> payments) {
        this.payments = payments;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivebool() {
        return activebool;
    }

    public void setActivebool(boolean activebool) {
        this.activebool = activebool;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
