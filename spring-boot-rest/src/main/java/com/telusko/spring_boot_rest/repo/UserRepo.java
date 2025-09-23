package com.telusko.spring_boot_rest.repo;

import com.telusko.spring_boot_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUsername(String Username);
}
