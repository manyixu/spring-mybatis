package com.guang.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by admin on 2016/2/25.
 */
public class UUIDUtil {

    public static String buildUUID(String aa){
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte bytes[] = md.digest(aa.getBytes());
            for (int i = 0; i < bytes.length; i++) {
                // 将整数转换成十六进制形式的字符串 这里与0xff进行与运算的原因是保证转换结果为32位
                String str = Integer.toHexString(bytes[i] & 0xFF);
                if (str.length() == 1) {
                    str += "F";
                }
                result += str;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String buildUUID(){
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte bytes[] = md.digest();
            for (int i = 0; i < bytes.length; i++) {
                // 将整数转换成十六进制形式的字符串 这里与0xff进行与运算的原因是保证转换结果为32位
                String str = Integer.toHexString(bytes[i] & 0xFF);
                if (str.length() == 1) {
                    str += "F";
                }
                result += str;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
