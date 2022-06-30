package com.sunny.donutshop.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;


@Entity
@Table(name = "Donuts")
public class Donut {

    @Id
    @SequenceGenerator(
            name = "donut_sequence",
            sequenceName = "donut_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "donut_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;


    @Column(
            name = "description",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String description;

    @Column(
            name = "price",
            nullable = false
    )
    private Integer price;

    @Column(
            name = "picture",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String picture_link;

    //Constructors
    public Donut() {

    }
    public Donut(Long id, String name, String description, Integer price, String picture_link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.picture_link = picture_link;
    }
    public Donut(String name, String description, Integer price, String picture_link) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.picture_link = picture_link;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPicture_link() {
        return picture_link;
    }

    public void setPicture_link(String picture_link) {
        this.picture_link = picture_link;
    }
}
