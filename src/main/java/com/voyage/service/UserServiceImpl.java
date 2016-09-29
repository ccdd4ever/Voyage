package com.voyage.service;

import com.voyage.models.User;
import com.voyage.models.UserRepository;
import com.voyage.service.api.UserService;
import com.voyage.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: void.
 * @Date: 9/28/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private TimeUtil timeUtil;

    @Override
    public User add(User user) {
        user.setCreateAt(timeUtil.getTimeStamp());
        user.setActive(true);
        userRepo.save(user);
        return user;
    }

    @Override
    public User findByUserName(String username) {
        return userRepo.findByUserName(username);
    }
}
