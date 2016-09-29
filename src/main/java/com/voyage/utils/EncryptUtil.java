package com.voyage.utils;


import org.springframework.stereotype.Service;

import static org.apache.commons.codec.digest.DigestUtils.md5Hex;


/**
 * @Author: void.
 * @Date: 9/28/16.
 */
@Service
public class EncryptUtil {

    //MD5 pwd: md5(md5(pwd)+username)
    public String MD5Pwd(String pwd, String userName) {

        String encryptedPwd = md5Hex(md5Hex(pwd) + userName);

        return encryptedPwd;
    }

    //TODO BCrypt
    public String BcryptPwd(String pwd) {
        return null;
    }

    /**
     * 登录校验
     *
     * @param encryptedString md5(md5(md5(密码) + 用户的QQ号) + 验证码)
     * @param verifyCode      验证码
     * @param passWord        持久化的md5后的密码
     * @return boolean
     */
    public boolean ValidatePwd(String encryptedString, String verifyCode, String passWord) {
        return md5Hex(passWord + verifyCode).equals(encryptedString);
    }
}
