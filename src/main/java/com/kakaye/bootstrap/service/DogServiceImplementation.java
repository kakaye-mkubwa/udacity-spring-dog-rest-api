package com.kakaye.bootstrap.service;

import com.kakaye.bootstrap.entity.Dog;
import com.kakaye.bootstrap.repository.DogBreed;
import com.kakaye.bootstrap.repository.DogName;
import com.kakaye.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImplementation implements DogService {
    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findDogBreed();
    }

    @Override
    public Dog retrieveDogBreedById(Long id) {
        Optional<Dog> optionalDog = Optional.ofNullable(dogRepository.findDogById(id));
        Dog result = optionalDog.orElseThrow(DogNotFoundException::new);
        return result;
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findDogName();
    }
}
