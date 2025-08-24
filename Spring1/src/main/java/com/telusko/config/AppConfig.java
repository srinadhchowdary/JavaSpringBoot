package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.telusko")
public class AppConfig {

/*
    @Bean
    public Alien Alien(Computer com){ //@Qualifier("laptop")
        Alien obj = new Alien();
        obj.setAge(22);
        obj.setMarks(32);
        obj.setCom(com);

        return obj;
    }


    //@Bean(name = {"com1","desktop1","beast"})
    @Bean()
//    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }


    @Bean()
    @Primary

    public Laptop laptop(){
        return new Laptop();
    }

 */

}
