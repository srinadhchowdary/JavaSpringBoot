package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.repo.UserRepo;
import com.telusko.spring_boot_rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    public User getUser(int id) {
        Optional<User> userOpt = userRepo.findById(id);

        if (!userOpt.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found with id: " + id);
        }

        User user = userOpt.get();
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());

        return user;
    }



    public User addUser(User user) {

        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);
    }
}
