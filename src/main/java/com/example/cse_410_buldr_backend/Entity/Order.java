package com.example.cse_410_buldr_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private long orderID;
    @Column(name="user_id")
    private long userID;
    @Column(name="post_id")
    private long postID;
    @Column(name="customer_name",columnDefinition = "TEXT")
    private String customerName;

    @Column(name="customer_contact",columnDefinition = "TEXT")
    private String customerContact;

    @Column(name="address",columnDefinition = "TEXT")
    private String addresss;

    @Column(name="qty")
    private long qty;

    @Column(name="status",columnDefinition = "TEXT")
    private String status;

    @Column(name="date",columnDefinition = "TEXT")
    private String date;

    @Column(name="note",columnDefinition = "TEXT")
    private String note;

    public Order(){}

    public Order(long orderID, long userID, long postID, String customerName, String customerContact, String addresss, long qty, String status, String date, String note) {
        this.orderID = orderID;
        this.userID = userID;
        this.postID = postID;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.addresss = addresss;
        this.qty = qty;
        this.status = status;
        this.date = date;
        this.note = note;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
