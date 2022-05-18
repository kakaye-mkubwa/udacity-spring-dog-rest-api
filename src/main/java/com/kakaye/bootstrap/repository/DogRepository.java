package com.kakaye.bootstrap.repository;

import com.kakaye.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long> {
    @Query(value = "SELECT id,breed FROM dog", nativeQuery = true)
    List<String> findDogBreed();

    @Query(value = "SELECT id,dog_name FROM dog", nativeQuery = true)
    List<String> findDogName();

    @Query(value = "SELECT * from dog where id = :id",nativeQuery = true)
    Dog findDogById(Long id);
}
