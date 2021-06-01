package com.springtraining.training.repo;

import com.springtraining.training.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepository extends CrudRepository<Author,Long> {
}
