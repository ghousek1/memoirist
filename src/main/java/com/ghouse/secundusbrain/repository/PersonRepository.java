package com.ghouse.secundusbrain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ghouse.secundusbrain.collection.Person;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {

    List<Person> findByFirstNameStartsWith(String name);

    //List<Person> findByAgeBetween(Integer min, Integer max);

    @Query(value = "{ 'age' : { $gt : ?0, $lt : ?1}}",
           fields = "{addresses:  0}")
    List<Person> findPersonByAgeBetween(Integer min, Integer max);
}
