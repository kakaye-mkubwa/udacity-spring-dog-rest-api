package com.kakaye.bootstrap.web;

import com.kakaye.bootstrap.entity.Dog;
import com.kakaye.bootstrap.repository.DogBreed;
import com.kakaye.bootstrap.repository.DogName;
import com.kakaye.bootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("dogs")
    public ResponseEntity<List<Dog>> getDogs(){
        List<Dog> list = dogService.retrieveDogs();
        return new ResponseEntity<List<Dog>>(list,HttpStatus.OK);
    }

    @GetMapping("/dog-breeds")
    public ResponseEntity<List<String>> getDogBreeds(){
        List<String> list = dogService.retrieveDogBreed();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/dog-names")
    public ResponseEntity<List<String>> getDogNames(){
        List<String> list = dogService.retrieveDogNames();
        return new ResponseEntity<List<String>>(list,HttpStatus.OK);
    }

    @GetMapping("/dog/{id}")
    public ResponseEntity<Dog> getDogById(@PathVariable Long id){
        Dog list = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<Dog>(list,HttpStatus.OK);
    }
}
