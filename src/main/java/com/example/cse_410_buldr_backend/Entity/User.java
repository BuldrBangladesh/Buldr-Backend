package com.example.cse_410_buldr_backend.Entity;

import jakarta.persistence.*;
//create table account(
//        userID INT not null,
//        designation VARCHAR(200),
//        company VARCHAR(200),
//        email VARCHAR(200),
//        phoneNo VARCHAR(200),
//        address VARCHAR(200),
//        github VARCHAR(200),
//        linkedin VARCHAR(200),
//        city VARCHAR(200),
//        buldr VARCHAR(200),
//        country VARCHAR(200)
//        );
//
//        insert into account(1,"company","a","a","a","a","a","a","a","a","a");
@Entity
@Table(name="account")
public class User {

    @Id
    @GeneratedValue
    private long userID;

    @Column(name="name",columnDefinition = "TEXT")
    private String name;
    @Column(name="designation",columnDefinition = "TEXT")
    private String designation;
    @Column(name="company",columnDefinition = "TEXT")
    private String company;
    @Column(name="email",columnDefinition = "TEXT")
    private String email;
    @Column(name="phoneNo",columnDefinition = "TEXT")
    private String phoneNo;
    @Column(name="address",columnDefinition = "TEXT")
    private String address;
    @Column(name="portfolio",columnDefinition = "TEXT")
    private String portfolio;
    @Column(name="github",columnDefinition = "TEXT")
    private String github;
    @Column(name="linkedin",columnDefinition = "TEXT")
    private String linkedin;
    @Column(name="buldr",columnDefinition = "TEXT")
    private String buldr;
    @Column(name="city",columnDefinition = "TEXT")
    private String city;
    @Column(name="country",columnDefinition = "TEXT")
    private String country;
    @Column(name="image",columnDefinition = "TEXT")
    private String image;
    @Column(name="bio",columnDefinition = "TEXT")
    private String bio;

    @Column(name="scholar_id",columnDefinition = "TEXT")
    private String scholar_id;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(long userID, String name, String designation, String company, String email, String phoneNo, String address, String portfolio, String github, String linkedin, String buldr, String city, String country, String image, String bio, String scholar_id) {
        this.userID = userID;
        this.name = name;
        this.designation = designation;
        this.company = company;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.portfolio = portfolio;
        this.github = github;
        this.linkedin = linkedin;
        this.buldr = buldr;
        this.city = city;
        this.country = country;
        this.image = image;
        this.bio = bio;
        this.scholar_id = scholar_id;
    }

    public String getScholar_id() {
        return scholar_id;
    }

    public void setScholar_id(String scholar_id) {
        this.scholar_id = scholar_id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User() {

    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getBuldr() {
        return buldr;
    }

    public void setBuldr(String buldr) {
        this.buldr = buldr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
