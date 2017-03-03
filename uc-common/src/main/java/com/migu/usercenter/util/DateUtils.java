package com.migu.usercenter.util;

import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date common method utils class.
 * <p><h2>Change History</h2>
 * 2016/12/5 | guanrongzhi | created
 * </p>
 * package: com.migu.usercenter.util
 *
 * @author guanrongzhi
 * @version 1.0.0
 */
public class DateUtils {
//    static Logger log = Logger.getLogger(DateUtils.class);

    public static final String SYSTEM_TIME_FORMAT = "ddMMyyyyHHmmssSSS";

    /**
     * 把字符串转换为日期
     *
     * @param dateStr 日期字符串
     * @param format  时间格式
     * @return Date
     */
    public static Date strToDate(String dateStr, String format) throws ParseException {
        Date date = null;
        if (!StringUtils.isEmpty(dateStr) && !StringUtils.isEmpty(format)) {
            DateFormat df = new SimpleDateFormat(format);
            date = df.parse(dateStr);
        }
        return date;
    }

    /**
     * 获取日期
     *
     * @param date    日期
     * @param pattern 样式
     * @return String
     */
    public static String getDate(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
