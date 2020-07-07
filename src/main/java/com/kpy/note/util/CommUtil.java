package com.kpy.note.util;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: com.kpy.note.util
 * @data: 2019-9-24 21:05
 * @discription: 公共工具类
 **/
public class CommUtil {
    /**
     * 利用UUID生成用户表唯一索引
     */
    public static String CreateId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }

    /**
     * 将传入的src加密处理
     *
     * @param src 明文字符串
     * @return 加密后的字符串结果
     */
    public static String MDS(String src) {
        //将字符串信息采用MD5处理
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] output = md.digest(src.getBytes());
            //将MD5处理结果利用Base64转成字符串
            String dec = Base64.encodeBase64String(output);
            return dec;
        } catch (Exception e) {
            throw new RuntimeException("密码加密失败", e);
        }
    }
}
