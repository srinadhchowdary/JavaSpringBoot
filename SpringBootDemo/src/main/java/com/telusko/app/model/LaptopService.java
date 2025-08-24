package com.telusko.app.model;

import com.telusko.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;


    public void addLaptop(Laptop lap){
        repo.saveLaptop(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
