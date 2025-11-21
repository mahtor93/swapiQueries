package org.example.models;

import java.net.URI;
import java.util.ArrayList;
import org.example.models.Entity;

public class Planet implements Entity {
    private String name;
    private String diameter;
    private String rotation_period;
    private String orbital_period;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String surface_water;
    private ArrayList<URI> residents;
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

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public ArrayList<URI> getResidents() {
        return residents;
    }

    public void setResidents(ArrayList<URI> residents) {
        this.residents = residents;
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
        return "Planet{" +
                "name='" + name + '\'' +
                ", diameter='" + diameter + '\'' +
                ", rotation_period='" + rotation_period + '\'' +
                ", orbital_period='" + orbital_period + '\'' +
                ", gravity='" + gravity + '\'' +
                ", population='" + population + '\'' +
                ", climate='" + climate + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surface_water='" + surface_water + '\'' +
                ", residents=" + residents +
                ", films=" + films +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
