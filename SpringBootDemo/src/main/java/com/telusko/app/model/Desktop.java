package com.telusko.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    //    @Autowired
//    CPU cpu;
    public void compile(){
        System.out.println("Compiling in Desktop");
    }
}
