package org.example.models;

import java.net.URI;
import java.util.ArrayList;
import org.example.models.Entity;

public class Specie implements Entity {
    private String name;
    private String classification;
    private String average_height;
    private String average_lifespan;
    private String eye_colors;
    private String hair_colors;
    private String skin_colors;
    private String languaje;
    private String homeworld;
    private ArrayList<URI> people;
    private ArrayList<URI> films;
    private String url;
    private String created;
    private String edited;

    @Override
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getAverage_height() {
        return average_height;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getLanguaje() {
        return languaje;
    }

    public void setLanguaje(String languaje) {
        this.languaje = languaje;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public ArrayList<URI> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<URI> people) {
        this.people = people;
    }

    public ArrayList<URI> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<URI> films) {
        this.films = films;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }


    @Override
    public String toString() {
        return "Specie{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", average_height='" + average_height + '\'' +
                ", average_lifespan='" + average_lifespan + '\'' +
                ", eye_colors='" + eye_colors + '\'' +
                ", hair_colors='" + hair_colors + '\'' +
                ", skin_colors='" + skin_colors + '\'' +
                ", languaje='" + languaje + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", people=" + people +
                ", films=" + films +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
