package org.example.models;

import java.net.URI;
import java.util.ArrayList;
import org.example.models.Entity;

public class People implements Entity{
    private String name;
    private int height;
    private int mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private URI homeworld;
    private ArrayList<URI> films;
    private ArrayList<URI> species;
    private ArrayList<URI> starships;
    private ArrayList<URI> vehicles;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public URI getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(URI homeworld) {
        this.homeworld = homeworld;
    }

    public ArrayList<URI> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<URI> films) {
        this.films = films;
    }

    public ArrayList<URI> getSpecies() {
        return species;
    }

    public void setSpecies(ArrayList<URI> species) {
        this.species = species;
    }

    public ArrayList<URI> getStarships() {
        return starships;
    }

    public void setStarships(ArrayList<URI> starships) {
        this.starships = starships;
    }

    public ArrayList<URI> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<URI> vehicles) {
        this.vehicles = vehicles;
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
        return "People{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                ", hair_color='" + hair_color + '\'' +
                ", skin_color='" + skin_color + '\'' +
                ", eye_color='" + eye_color + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld=" + homeworld +
                ", films=" + films +
                ", species=" + species +
                ", starships=" + starships +
                ", vehicles=" + vehicles +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
