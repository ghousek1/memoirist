package com.ghouse.secundusbrain.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ghouse.secundusbrain.entity.Profile;

@Repository
public interface ProfileRepo extends MongoRepository<Profile,String> {
}
