package com.ronodev.toTrade_RestAPI.Model;


import jakarta.persistence.*;

@Entity
@Table(name="Tutorials")
public class LearningTutorials {

    @Id
    @SequenceGenerator
            (name = "student_sequence", sequenceName = "student_sequence",allocationSize = 1)

    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "student_sequence")

    private long id ;
    private String description;
    private boolean published;
    private  String title;


    public LearningTutorials()
    {

    }

    public LearningTutorials(String title, String description, boolean b) {
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublished() {
        return published;
    }

    public String getTitle() {
        return title;
    }
}

