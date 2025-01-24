package com.example.cse_410_buldr_backend.Entity;

import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity
@Table(name="note")
public class Note {
    @Id
    @GeneratedValue
    private long noteID;

    @Column(name="user_id")
    private long userID;

    @Column(name="title",columnDefinition = "TEXT")
    private String title;

    @Column(name="subtitle",columnDefinition = "TEXT")
    private String subtitle;

    @Column(name="content",columnDefinition = "TEXT")
    private String content;

    @Column(name="image",columnDefinition = "TEXT")
    private String image;
    @Column(name="private")
    private Boolean prvt;

    @Type(ListArrayType.class)
    @Column(name="tags",columnDefinition = "text[]")
    private List<String> tags;

    public Note(){}

    public Note(long noteID, long userID, String title, String subtitle, String content, String image, Boolean prvt, List<String> tags) {
        this.noteID = noteID;
        this.userID = userID;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
        this.image = image;
        this.prvt = prvt;
        this.tags = tags;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getNoteID() {
        return noteID;
    }

    public void setNoteID(long noteID) {
        this.noteID = noteID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getPrvt() {
        return prvt;
    }

    public void setPrvt(Boolean prvt) {
        this.prvt = prvt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
