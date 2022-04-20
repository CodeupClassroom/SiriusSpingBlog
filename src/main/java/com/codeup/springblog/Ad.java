package com.codeup.springblog;

import javax.persistence.*;

@Entity
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //set the field for the id

    //move on down to make more fields
    @Column(nullable = false, length = 50) //NOT NULL length 100? varchar(100)?
    private String title;

    @Column(nullable = false) //Not null. . no other customization
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
