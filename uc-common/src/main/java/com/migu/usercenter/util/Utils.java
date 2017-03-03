package com.migu.usercenter.util;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;


/**
 * Created by babyh on 2017/1/14.
 */
public class Utils {
    private static Log logger = LogFactory.getLog(Utils.class);

    private static final String EMAIL_PATTERN = "^([a-zA-Z0-9\\_\\-\\.])+@([a-zA-Z0-9\\_\\-\\.])+(\\.([a-zA-Z0-9])+)+$";
    public static boolean isEmail(String email) {
        return StringUtils.isEmpty(email) ? false:email.matches(EMAIL_PATTERN);
    }
}


/**
 *  * Created by babyh on 2017/3/4
 *   */

public class Utils {
    private static Log logger = LogFactory.getLog(Utils.class);

    private static final String EMAIL_PATTERN = "^([a-zA-Z0-9\\_\\-\\.])+@([a-zA-Z0-9\\_\\-\\.])+(\\.([a-zA-Z0-9])+)+$";
    public static boolean isEmail(String email) {
        return StringUtils.isEmpty(email) ? false:email.matches(EMAIL_PATTERN);
    }
}
