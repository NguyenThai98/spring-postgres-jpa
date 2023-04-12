package com.jpa.springpostgres.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Date: 4/11/2023<br/>
 * Time: 10:17 AM<br/>
 */

public class PaymentModel implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long paymentId;

    private Long customerId;

    private Long staffId;

    private Long rentalId;

    private float amount;

    private Date paymentDate;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
