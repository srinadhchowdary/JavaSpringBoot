package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.repo.UserRepo;
import com.telusko.spring_boot_rest.model.User;
import com.telusko.spring_boot_rest.model.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);

        if(user == null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("User 404");
        }
        System.out.println("User login successfully");

        return new UserPrinciple(user);
    }
}
