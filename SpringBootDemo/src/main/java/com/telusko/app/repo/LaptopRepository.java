package com.telusko.app.repo;

import com.telusko.app.model.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {

    public void saveLaptop(Laptop lap){
        System.out.println("Saved in Database....");
    }
}
