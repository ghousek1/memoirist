package com.ghouse.secundusbrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ghouse.secundusbrain.entity.Profile;
import com.ghouse.secundusbrain.service.ProfileService;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile/permissions/{userName}")
    public ResponseEntity<List<String>> getProfilePermissions(@PathVariable String userName) {
        List<String> permissions = profileService.getProfilePermissions(userName);
        return new ResponseEntity<>(permissions, HttpStatus.OK);
    }

    @PostMapping("/profile/new")
    public ResponseEntity<Profile> addProfile(@RequestBody Profile profile) {
        Profile savedProfile = profileService.addProfile(profile);
        return new ResponseEntity<>(savedProfile, HttpStatus.OK);
    }


}
