package com.telusko.springdatarestdemo.repo;

import com.telusko.springdatarestdemo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {


}