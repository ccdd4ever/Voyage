package com.voyage.utils;

import java.util.Random;

/**
 * @Author: void.
 * @Date: 9/28/16.
 */
public class StringUtil {
    static String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String RandomString(int len) {
        Random rand = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append(CHARS.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

}
