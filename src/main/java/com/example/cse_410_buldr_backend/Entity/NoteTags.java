package com.example.cse_410_buldr_backend.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="note_tags")
public class NoteTags {

    @Id
    @GeneratedValue
    private long tagID;

    @Column(name="name",columnDefinition = "TEXT")
    private String name;
    @Column(name="color",columnDefinition = "TEXT")
    private String color;

    public NoteTags(){}

    public NoteTags(long tagID, String name, String color) {
        this.tagID = tagID;
        this.name = name;
        this.color = color;
    }

    public long getTagID() {
        return tagID;
    }

    public void setTagID(long tagID) {
        this.tagID = tagID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

