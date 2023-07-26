package com.ghouse.memoirist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghouse.memoirist.entity.Profile;
import com.ghouse.memoirist.repo.ProfileRepo;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    private ProfileRepo profileRepo;

    @Override
    public List<String> getProfilePermissions(String userName) {
        Optional<Profile> profile = profileRepo.findById(userName);

        if(profile.isPresent()){
            return profile.get().getRoles();
        }

        return Collections.emptyList();
    }

    @Override
    public Profile addProfile(Profile profile) {
        return profileRepo.save(profile);
    }
}
