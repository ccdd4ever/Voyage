package com.voyage.controller.user;

import com.voyage.models.User;
import com.voyage.service.api.UserService;
import com.voyage.utils.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: void.
 * @Date: 9/29/16.
 */
@RestController
@RequestMapping("app/vi")
public class LoginCtrl {

    @Autowired
    private EncryptUtil encryptUtil;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String Login(@RequestParam String userName, @RequestParam String encryptedString, @RequestParam String verifyCode) {
        //get login user
        User loginUser = userService.findByUserName(userName);
        if (loginUser == null) {
            return "not found";
        }

        //check pwd
        if (encryptUtil.ValidatePwd(encryptedString, verifyCode, loginUser.getPassWord())) {
            return "password matched,welcome " + loginUser.getCnName();
        }

        //TODO write cookie

        //TODO write session
        return null;
    }
}
