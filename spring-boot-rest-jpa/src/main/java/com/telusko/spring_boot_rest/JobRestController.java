package com.telusko.spring_boot_rest;


import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {


    @Autowired
    private JobService service;


        @GetMapping(value = "jobPosts",produces = {"application/json"})
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping(value = "jobPost")
    public JobPost addPost(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updatePost(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deletePost(@PathVariable int postId){
        service.deleteJob(postId);
        return "Post Deleted";
    }

    @GetMapping("load")
    public String load(){
        service.load();
        return "success";
    }


    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }





}