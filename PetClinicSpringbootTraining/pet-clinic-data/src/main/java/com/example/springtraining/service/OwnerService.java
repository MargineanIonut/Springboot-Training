package com.example.springtraining.service;

import com.example.springtraining.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
     Owner findByLastName(String lastName);

}
