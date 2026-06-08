package com.thinkconstructive.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restdemo.model.CloudService;

@RestController
@RequestMapping("/cloudservices")
public class CloudServiceAPI {

    CloudService cloudService;
    @GetMapping("{serviceId}")
    public CloudService getCloudService(String serviceId){
        return cloudService;
    }

    @PostMapping
    public String createCloudService(@RequestBody CloudService cloudService){
        this.cloudService = cloudService;
        return "Cloud Service Created Successfully";
    }

    @PutMapping
    public String updateCloudService(@RequestBody CloudService cloudService){
        this.cloudService = cloudService;
        return "Cloud Service updated Successfully";
    }

    @DeleteMapping("{serviceId}")
    public String deleteCloudService(String serviceId){
        this.cloudService = null;
        return "Cloud Services Deleted Successfully";
    }

}
