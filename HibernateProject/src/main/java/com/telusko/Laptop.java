package com.telusko;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;


    //from laptop perspective one alien is mappped to many laptops
    //@ManyToOne
//    private Alien alien;


//    @ManyToMany(mappedBy = "Laptops")
//    private List<Alien> aliens;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

//    public List<Alien> getAliens() {
//        return aliens;
//    }
//
//    public void setAliens(List<Alien> aliens) {
//        this.aliens = aliens;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
