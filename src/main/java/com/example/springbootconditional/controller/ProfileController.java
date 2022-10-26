package com.example.springbootconditional.controller;


import com.example.springbootconditional.profile.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProfileController {

    private SystemProfile profile;

    public ProfileController(SystemProfile profile){
        this.profile = profile;
    }

    @GetMapping
    public String getMessage(){
        return profile.getProfile();
    }
}
