package com.telusko.SpringEcom.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private String imageName;
    private String imageType;


    @Lob
    private byte[] imageData;
//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")

    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    public Product(int id) {
        this.id=id;
    }
}
