package com.telusko.springdatarestdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key with auto-increment
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

}
