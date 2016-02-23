package com.guang.daomain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by admin on 2016/2/22.
 */
public class User {
    private int id;
    private String phone;
    private String userName;
    private String passWord;
    private String sex;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte bytes[] = md.digest(passWord.getBytes());
            for (int i = 0; i < bytes.length; i++){
                // 将整数转换成十六进制形式的字符串 这里与0xff进行与运算的原因是保证转换结果为32位
                String str = Integer.toHexString(bytes[i] & 0xFF);
                if (str.length() == 1) {
                    str += "F";
                }
                result += str;
            }
            this.passWord = result.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
