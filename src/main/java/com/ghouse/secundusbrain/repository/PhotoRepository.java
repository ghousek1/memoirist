package com.ghouse.secundusbrain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ghouse.secundusbrain.collection.Photo;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {
}
