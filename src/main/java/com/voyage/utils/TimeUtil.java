package com.voyage.utils;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: void.
 * @Date: 9/28/16.
 */
@Service
public class TimeUtil {

    public Long getTimeStamp() {
        Date date = new Date();
        long timestamp = (date.getTime() / 1000);
        return timestamp;
    }
}
