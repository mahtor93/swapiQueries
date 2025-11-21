package org.example.models;

import java.net.URI;
import java.util.ArrayList;

public class Film implements Entity{
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private ArrayList<URI> species;
    private ArrayList<URI> starships;
    private ArrayList<URI> vehicles;
    private ArrayList<URI> characters;
    private ArrayList<URI> planets;
    private String url;
    private String created;
    private String edited;

    public String getTitle() {
        return title;
    }

    public String getName(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
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

    public ArrayList<URI> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<URI> planets) {
        this.planets = planets;
    }

    public ArrayList<URI> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<URI> characters) {
        this.characters = characters;
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
        return "Film{" +
                "'title:'" + title + '\'' +
                ", 'episode_id':" + episode_id +
                ", 'opening_crawl':'" + opening_crawl + '\'' +
                ", 'director':'" + director + '\'' +
                ", 'producer':'" + producer + '\'' +
                ", 'release_date':'" + release_date + '\'' +
                ", 'species':" + species +
                ", 'starships':" + starships +
                ", 'vehicles':" + vehicles +
                ", 'characters':" + characters +
                ", 'planets':" + planets +
                ", 'url':'" + url + '\'' +
                ", 'created':'" + created + '\'' +
                ", 'edited':'" + edited + '\'' +
                '}';
    }
}
