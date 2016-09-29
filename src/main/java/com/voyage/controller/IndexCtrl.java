package com.voyage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by void on 9/18/16.
 */
@RestController
public class IndexCtrl {
    @RequestMapping("/")
    public String home() {
        return "hello world!";
    }
}
