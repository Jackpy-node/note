package com.kpy.note.dao;

import com.kpy.note.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.dao
 * @data: 2019-9-24 20:59
 * @discription: 用户持久层接口
 **/


public interface UserDao {
    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User SelectOne(String username);

    /**
     * 新增用户
     *
     * @param user
     */
    void Insert(User user);

    /**
     * 更新用户
     *
     * @param user
     */
    void Update(User user);
}
