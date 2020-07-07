package com.kpy.note.controller;

import com.kpy.note.entity.User;
import com.kpy.note.service.UserService;
import com.kpy.note.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.controller
 * @data: 2019-9-24 18:19
 * @discription: 注册
 **/

@Controller
public class RegisterController {
    private static Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public @ResponseBody
    Result<Object> Register(@RequestBody User user) {
        Result<Object> result = userService.RegisterUser(user);
        logger.debug("RegisterController result:{}", result);
        return result;
    }
}
