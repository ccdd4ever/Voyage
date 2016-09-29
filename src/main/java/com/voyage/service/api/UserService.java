package com.voyage.service.api;

import com.voyage.models.User;

/**
 * @Author: void.
 * @Date: 9/29/16.
 */
public interface UserService {
    User add(User user);

    User findByUserName(String userName);
}
