package com.voyage.models;

import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * @Author: void.
 * @Date: 9/18/16.
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByUserName(String username);
}
