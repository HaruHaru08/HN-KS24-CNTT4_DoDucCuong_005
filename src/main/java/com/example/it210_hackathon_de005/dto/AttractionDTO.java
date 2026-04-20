package com.example.it210_hackathon_de005.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AttractionDTO {
    @NotNull(message = "ID không được để trống")
    private Long id;
    @NotBlank(message = "Tên địa danh không được để trống")
    @Size(min = 10,max = 200,message = "Tên địa danh phải từ 10 đến 200 ký tự")
    private String name;
    @NotBlank(message = "Địa chỉ không được để trống")
    private String location;
    private String description;
    @DecimalMin(value = "1.0", inclusive = true, message = "Điểm đánh giá phải từ 1.0")
    @DecimalMax(value = "5.0", inclusive = true, message = "Điểm đánh giá phải nhỏ hơn hoặc bằng 5.0")
    private Double rating;
    private String coverImage;

    public AttractionDTO() {
    }

    public AttractionDTO(Long id, String name, String location, String description, Double rating, String coverImage) {
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
