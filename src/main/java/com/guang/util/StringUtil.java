package com.guang.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 15-8-18.
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str){
        if (str==null)
            return true;
        if (str.isEmpty())
            return true;
        return false;
    }

    /**
     * 判断字符串是否为手机
     * @param str
     * @return
     */
    public static boolean isMobile(String str){
        if (str==null || str.length()==0)
            return false;
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    /**
     * 判断字符串是否为金钱
     * @param str
     * @return
     */
    public static boolean isMoney(String str){
        if (str==null || str.length()==0)
            return false;
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^(([1-9]{1}\\d{0,9})|([0]{1}))(\\.(\\d{1,2}))?$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }

    public static String formatString(String text) {
        return (text == null ? "" : text.trim());
    }
}
