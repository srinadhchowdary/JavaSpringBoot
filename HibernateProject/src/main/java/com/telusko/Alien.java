package com.telusko;


import jakarta.persistence.*;

import java.util.List;


@Entity()
//@Table(name="Alien_Table")
public class Alien {

    @Id
    //@Column(name = "Alien_id")
    private int aid;

    //@Column(name="Alien_name")
    private String anmame;

    //@Transient // avoid in db table
    private String tech;

//    @OneToOne
//    private Laptop Laptop;

    //from alien perspective one laptop is mapped to many aliens
    //@OneToMany(mappedBy = "alien")

    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> Laptops;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAnmame() {
        return anmame;
    }

    public void setAnmame(String anmame) {
        this.anmame = anmame;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return Laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        Laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", anmame='" + anmame + '\'' +
                ", tech='" + tech + '\'' +
                ", Laptop=" + Laptops +
                '}';
    }
}
