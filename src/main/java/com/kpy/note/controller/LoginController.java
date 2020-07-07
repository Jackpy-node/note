package com.kpy.note.controller;

import com.kpy.note.entity.User;
import com.kpy.note.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * @author 17607
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.controller
 * @data: 2019-9-9 17:29
 * @discription: 登录
 **/

@Controller
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    @GetMapping("/login")
    public String index() {
        return "login";
    }

    @PostMapping("/login.do")
    public void Login(@RequestBody User user) {
        System.out.println("111111111111");
        logger.debug("Username:{}", user.getUsername());
        logger.debug("Password:{}", user.getPassword());
        userService.RegisterUser(user);
        //return "login";
    }
}
