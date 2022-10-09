package com.usermicroservice.userms.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.usermicroservice.userms.Models.*;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);
  
    User findById(long user_id);
  }