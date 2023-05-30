package com.example.securingweb.Repository;

import com.example.securingweb.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
