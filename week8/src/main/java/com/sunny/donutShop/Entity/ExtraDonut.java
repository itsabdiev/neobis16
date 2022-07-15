package com.sunny.donutShop.Entity;

import org.springframework.web.multipart.MultipartFile;

public class ExtraDonut {
    private String name;
    private String description;
    private MultipartFile picture;
    private Integer price;

    public ExtraDonut(String name, String description, MultipartFile picture, Integer price) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.price = price;
    }

    public ExtraDonut() {
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

    public MultipartFile getPicture() {
        return picture;
    }

    public void setPicture(MultipartFile picture) {
        this.picture = picture;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
