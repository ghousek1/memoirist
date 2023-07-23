package com.ghouse.secundusbrain.service;

import java.util.List;

import com.ghouse.secundusbrain.entity.Profile;

public interface ProfileService {
    List<String> getProfilePermissions(String userName);

    Profile addProfile(Profile profile);
}
