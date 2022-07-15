package com.sunny.donutShop.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.IOException;
import java.util.Base64;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "donuts")
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
            length = 9999
    )
    private String picture;

    //Constructors
    public Donut(String name, String description, Integer price, MultipartFile file) {
        this.name = name;
        this.description = description;
        this.price = price;
        try {
            this.picture = Base64.getEncoder().encodeToString(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
