package com.example.securingweb.Repository;

import com.example.securingweb.Entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    Review findByName(String name);
}
