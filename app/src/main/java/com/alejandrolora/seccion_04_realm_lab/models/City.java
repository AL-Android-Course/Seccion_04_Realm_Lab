package com.alejandrolora.seccion_04_realm_lab.models;

import com.alejandrolora.seccion_04_realm_lab.application.MyApp;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Alejandro on 30/10/16.
 */

public class City extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String name;
    @Required
    private String description;
    @Required
    private String image;
    private float stars;


    public City() {
    }


    public City(String name, String description, String link, float stars) {
        this.id = MyApp.CityID.incrementAndGet();
        this.name = name;
        this.description = description;
        this.image = link;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }
}
