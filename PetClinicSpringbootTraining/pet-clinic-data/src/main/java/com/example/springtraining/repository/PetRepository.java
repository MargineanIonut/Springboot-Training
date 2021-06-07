package com.example.springtraining.repository;

import com.example.springtraining.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
