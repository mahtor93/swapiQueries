package org.example.models;

import java.net.URI;
import java.util.ArrayList;
import org.example.models.Entity;

public class Vehicle implements Entity {
    private String name;
    private String model;
    private String vehicle_class;
    private String manufacturer;
    private String length;
    private String cost_in_credits;
    private String crew;
    private String passengers;
    private String max_atmosphering_speed;
    private String cargo_capacity;
    private String consumables;
    private ArrayList<URI> films;
    private ArrayList<URI> pilots;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVehicle_class() {
        return vehicle_class;
    }

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<URI> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<URI> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<URI> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<URI> films) {
        this.films = films;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", vehicle_class='" + vehicle_class + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", length='" + length + '\'' +
                ", cost_in_credits='" + cost_in_credits + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", max_atmosphering_speed='" + max_atmosphering_speed + '\'' +
                ", cargo_capacity='" + cargo_capacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", films=" + films +
                ", pilots=" + pilots +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
