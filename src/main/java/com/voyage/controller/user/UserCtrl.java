package com.voyage.controller.user;

import com.voyage.models.User;
import com.voyage.service.api.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: void.
 * @Date: 9/28/16.
 */
@RestController
@RequestMapping("/app/v1")
public class UserCtrl {
    public static final Logger logger = LoggerFactory.getLogger(UserCtrl.class);

    @Autowired
    private UserService userService;

    //TODO
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User Get(@RequestParam String username) {
        logger.info(username);
        return userService.findByUserName(username);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> Add(@RequestBody User user) {
        HttpHeaders httpHeaders = new HttpHeaders();
        if (!user.valid()) {
            return new ResponseEntity<>(null, httpHeaders, HttpStatus.BAD_REQUEST);
        }
        try {
            userService.add(user);
            logger.info(user.toString());
            return new ResponseEntity<>(user, httpHeaders, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("User add failed with", e);
            return new ResponseEntity<>(null, httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
