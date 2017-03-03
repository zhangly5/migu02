package com.migu.usercenter.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Created by mael on 2016/11/29.
 */
public class Base64Utils {
    /**
     * 对字符串进行BASE64编码
     * @param param
     * @return
     */
    public static String getBASE64FromString(String param){
        if(null == param || "".equals(param)){
            return param;
        }
        return (new BASE64Encoder()).encode(param.getBytes());
    }

    public static String getBASE64FromByte(byte[] param){
        if(null == param || 0 == param.length){
            return (null == param? null:"");
        }
        return (new BASE64Encoder()).encode(param);
    }

    /**
     * 对BASE64编码的字符串进行解码
     * @param param
     * @return
     */
    public static String getStringFromBASE64(String param){
        if(null == param || "".equals(param)){
            return param;
        }
        try {
            byte[] result = (new BASE64Decoder()).decodeBuffer(param);
            return new String(result);
        }catch (Exception e){
            return null;
        }
    }

    public static byte[] getByteFromBASE64(String param){
        if(null == param){
            return null;
        }
        try {
            return (new BASE64Decoder()).decodeBuffer(param);
        }catch (Exception e){
            return null;
        }
    }
}
