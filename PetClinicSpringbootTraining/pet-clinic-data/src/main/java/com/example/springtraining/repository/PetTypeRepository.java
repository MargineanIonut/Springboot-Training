package com.example.springtraining.repository;

import com.example.springtraining.model.PetType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
