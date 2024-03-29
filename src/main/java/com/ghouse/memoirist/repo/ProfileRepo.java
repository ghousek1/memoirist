package com.ghouse.memoirist.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ghouse.memoirist.entity.Profile;

@Repository
public interface ProfileRepo extends MongoRepository<Profile,String> {
}
