package com.example.cse_410_buldr_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="post_block")
public class PostBlock {

    @Id
    @GeneratedValue
    private long postBlockID;

    @Column(name="post_id")
    private long postID;
    @Column(name="type",columnDefinition = "TEXT")
    private String type;

    @Column(name="title",columnDefinition = "TEXT")
    private String title;
    @Column(name="content",columnDefinition = "TEXT")
    private String content;
    @Column(name="serial")
    private long serial;
    @Column(name="marketplace")
    private Boolean marketplace;
    @Column(name="social")
    private Boolean social;

    public PostBlock(){}

    public PostBlock(long postBlockID, long postID, String type, String title, String content, long serial, Boolean marketplace, Boolean social) {
        this.postBlockID = postBlockID;
        this.postID = postID;
        this.type = type;
        this.title = title;
        this.content = content;
        this.serial = serial;
        this.marketplace = marketplace;
        this.social = social;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPostBlockID() {
        return postBlockID;
    }

    public void setPostBlockID(long postBlockID) {
        this.postBlockID = postBlockID;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public Boolean getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    public Boolean getSocial() {
        return social;
    }

    public void setSocial(Boolean social) {
        this.social = social;
    }
}

