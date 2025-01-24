package com.example.cse_410_buldr_backend.Entity;

import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue
    private long postID;

    @Column(name="user_id")
    private long userID;
    @Column(name="date",columnDefinition = "TEXT")
    private String date;
    @Column(name="title",columnDefinition = "TEXT")
    private String title;
    @Column(name="subtitle",columnDefinition = "TEXT")
    private String subtitle;
    @Column(name="image",columnDefinition = "TEXT")
    private String image;
    @Column(name="marketplace")
    private Boolean marketplace;
    @Column(name="social")
    private Boolean social;

    //https://vladmihalcea.com/postgresql-array-java-list/?source=post_page-----b4e25ca13490--------------------------------
    //https://github.com/vladmihalcea/hypersistence-utils#installation-guide //Installed Hibernate 6
    @Type(ListArrayType.class)
    @Column(name="tags",columnDefinition = "text[]")
    private List<String> tags;

    public Post(){}
    public Post(long postID, long userID, String date, String title, String subtitle, String image, Boolean marketplace, Boolean social, List<String> tags) {
        this.postID = postID;
        this.userID = userID;
        this.date = date;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.marketplace = marketplace;
        this.social = social;
        this.tags = tags;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
