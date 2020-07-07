package com.kpy.note.entity;

import java.io.Serializable;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.entity
 * @data: 2019-9-9 10:38
 * @discription: 登录用户实例
 **/

public class User implements Serializable {
    private String id;          //用户id
    private String username;    //用户名称
    private String nick;        //昵称
    private String password;    //密码
    private String token;       //令牌

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
