package com.kpy.note.service;

import com.kpy.note.entity.User;
import com.kpy.note.util.Result;
import org.springframework.stereotype.Service;

/**
 * @author 17607
 * @version: 1.0
 * @Package: com.kpy.note.service
 * @data: 2019-9-24 18:17
 * @discription: 用户操作
 **/


public interface UserService {
    Result<Object> RegisterUser(User user);
}
