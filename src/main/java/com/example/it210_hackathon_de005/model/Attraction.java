package com.example.it210_hackathon_de005.model;

public class Attraction {
    private Long id;
    private String name;
    private String location;
    private String description;
    private Double rating;
    private String coverImage;

    public Attraction() {
    }

    public Attraction(Long id, String name, String location, String description, Double rating, String coverImage) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.rating = rating;
        this.coverImage = coverImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
}
