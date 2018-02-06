package com.example.ali.swipecardsapp.model;

/**
 * Created by Ali on 30.1.2018.
 */

public class Model {
    public String title,image;

    public Model(String title,String image){
        this.title=title;
        this.image=image;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
