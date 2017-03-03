package com.migu.usercenter.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/**
 * 用户密码加密
 * Created by Administrator on 2015/8/9.
 */
public class MD5Utils {
    private static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f'};
    /**
     * MD5加密
     *
     * @param s 字符串
     * @return MD5加密 字符串
     */
    public static String encode(String s) {
        try {
            return encode(s.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String encode(byte[] b) {

        try {
            byte[] strTemp;
            strTemp = b;
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (byte byte0 : md) {
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] arge) throws Exception {
       System.out.println(MD5Utils.encode("12345600000000"));
    }
}
