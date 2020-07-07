package com.kpy.note.service;

import com.kpy.note.dao.UserDao;
import com.kpy.note.entity.User;
import com.kpy.note.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 17607
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.service
 * @data: 2019-9-24 19:07
 * @discription:
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDao userDao;

    @Override
    public Result<Object> RegisterUser(User user) {

        User user1 = userDao.SelectOne("1111");

        Result<Object> result = new Result<>();
        result.setStatus(0);
        logger.debug("UserServiceImpl result:{}", result);
        return result;
    }
}
