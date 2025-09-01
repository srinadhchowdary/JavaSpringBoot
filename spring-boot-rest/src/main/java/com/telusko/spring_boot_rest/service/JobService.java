package com.telusko.spring_boot_rest.service;


import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;


    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJob(int jobId) {
        return repo.getJob(jobId);
    }

    public JobPost updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
        return repo.getJob(jobPost.getPostId());
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
