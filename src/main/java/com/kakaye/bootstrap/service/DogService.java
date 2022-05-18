package com.kakaye.bootstrap.service;

import com.kakaye.bootstrap.entity.Dog;
import com.kakaye.bootstrap.repository.DogBreed;
import com.kakaye.bootstrap.repository.DogName;

import java.util.List;
import java.util.Optional;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    Dog retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
