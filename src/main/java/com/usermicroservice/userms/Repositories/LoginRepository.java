package com.usermicroservice.userms.Repositories;

import com.usermicroservice.userms.Models.Login;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface LoginRepository extends CrudRepository<Login, Long> {
 
    @Query("SELECT u FROM Login u WHERE u.username = :username")
    public Login getLoginByLoginname(@Param("username") String username);
}