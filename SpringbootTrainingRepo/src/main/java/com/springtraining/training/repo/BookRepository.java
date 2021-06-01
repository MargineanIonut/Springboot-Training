package com.springtraining.training.repo;

import com.springtraining.training.model.Book;
import org.springframework.data.repository.CrudRepository;
import sun.rmi.runtime.Log;

public interface BookRepository extends CrudRepository<Book, Long> {
}
