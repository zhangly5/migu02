add by zhangly5 for cangku


add by zhangly5 for test


/*
 * All rights Reserved, Designed By MiGu
 * Copyright (c) 2016 - 2020
 * Company MiGu Co., Ltd
 */

package com.migu.usercenter.common;

/**
 * function description.
 * <p>
 * <p><h2>Descriptions</h2>
 * <h3>Project</h3> UserCenter
 * <h3>Package</h3> com.migu.usercenter.common
 * </p>
 * <p><h2>Change History</h2>
 * 2016/11/30 1:28 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
public class Constant {
    /**
     * 编码:utf-8
     */
    public static final String CHARACTER_UTF_8 = "utf-8";

    public static final String SUPER_ADMIN = "superAdmin";
    /**
     * 盐：salt = 8
     */
    public static final Integer SALT_LENGTH = 8;

    /**
     * 用户名
     */
    public static final String COOKIE_USER_NAME = "username";

    public static final String COOKIE_USER_TOKEN = "userToken";

    public static final String UC_PLATFORM_ACCESS_TOKEN = "UC_PLATFORM_ACCESS_TOKEN";

    //用户信息field
    public static final String USER_INFO_FIELD = "USER_INFO_FIELD";

    public static final String USER_ROLE_FIELD = "USER_ROLE_FIELD";

    public static final String USER_MENU_FIELD = "USER_MENU_FIELD";

    public static final String CLIENT_SESSION_ID = "client_uuid";

    public static final String IMAGE_CODE = "IMAGE_CODE";

    public static final String U_SESSION_ID = "u_sessionId";

    public static final String SUCCESS_RETURN = "success";

    public static final String SESSION_ID = "sessionid";

    //time second
    public static final int TWO_HOURS = 7200;
    public static final int ONE_HOUR = 3600;
    public static final int HALF_HOUR = 1800;
    public static final int FIVE_MINUTES = 300;


    /**
     * 用户id
     */
    public static final String COOKIE_USER_ID = "userId";

    public static final String COOKIE_USER_TYPE = "user_type";

    public static final String SHOPKEEPER_TOKEN = "SHOPKEEPER_TOKEN";

    public static final String SHOP_INFO = "SHOP_INFO_";

    // 接口请求路径
    // 账户信息查询接口
    public static final String PASSPORTINFO_INQUIRE = "/api/passportInfoInquire";

    // 重置密码接口
    public static final String RESET_PASSWORD = "/api/resetPassword";

    // 头像查询
    public static final String HEADIMG_INQUIRE = "/api/headImgInquire";

    // 查询密保问题
    public static final String SETTEDSECURITY_LIST = "/api/settedSecurityList";

    //咪咕账号验证接口
    public static final String MIGUPASSPORT_VALIDATE = "/api/passportValidate";

    // 第三方登录
    public static final String THIRD_PARTY_LOGIN = "/api/thirdPartyLoginRequest";
    //主页url
    public static final String  CASH_EMAIL_VALIDAT = "CASH_EMAIL_VALIDAT";
    public static final String  CACHE_EMAIL_BIND_PREFIX = "CACHE_EMAIL_BIND_PREFIX";
    public static final String  SESSION_KEY_EMAIL_VALID_PASSID = "SESSION_KEY_EMAIL_VALID_PASSID";
    public static final String  SESSION_KEY_EMAIL_VALID_TOKEN = "SESSION_KEY_EMAIL_VALID_TOKEN";
    public static final String  RESULTCODE_SUCESS = "104000";

    //获取身份凭证
    public static final String GET_TOKEN = "/api/getToken";

    //凭证验证
    public static final String TOKEN_VALIDATE = "/api/tokenValidate";


    //用户注册
    public static final String USER_REGISTER = "/api/userRegister";

    //请求邮件验证
    public static final String EMAIL_VALIDATION_REQUEST = "/api/emailValidationRequest";

    //设置用户头像
    public static final String HEADIMG_SET = "/api/headImgSet";

    //昵称查询
    public static final String NICKNAME_INQUIRE = "/api/nicknameInquire";

    //设置用户昵称
    public static final String NICKNAME_SET = "/api/nicknameSet";

    //头像和昵称查询
    public static final String HEADIMG_AND_NICKNAME_NICKNAME_INQUIRE = "/api/headImgAndNicknameInquire";

    //设置用户昵称和头像
    public static final String HEADIMG_AND_NICKNAME_NICKNAME_SET = "/api/headImgAndNicknameSet";

    //查询所有密保问题
    public static final String INQUIRYSECURITY_LIST = "/api/inquirySecurityList";

    //设保置密问题
    public static final String SET_SECURITYANSWER = "/api/setSecurityAnswer";

    //验证密保问题
    public static final String SECURITYANSWER_VALIDATE = "/api/securityAnswerValidate";

    //更新密保问题
    public static final String UPDATE_SECURITYANSWER = "/api/updateSecurityAnswer";
    //发送旧邮箱验证
    public static final String SEND_OLDEMAIL = "/api/emailValidationRequest";
    //旧邮箱验证
    public static final String VALID_OLDEMAIL = "/api/accountVerify";
    //发送新邮箱验证
    public static final String SEND_NEWEMAIL = "/api/emailValidationRequest";
    //新邮箱验证
    public static final String VALID__BIND_NEWMAIL = "/api/accountBind";

    //忘记密码邮件发送
    public static final String SEND_PASSWOEDMAIL = "/api/emailValidationRequest";
    //忘记密码验证
    public static final String VALID_PASSWORDMAIL = "/api/resetPassword";
    //调用杭研接口返回成功编码
    public static final String SUCCESS = "104000";

    public static final String USERREGISTER_ = "USER_REGISTER_SESSION_ID";

    /**
     * 请求邮件验证的业务代码：注册：0
     */
    public interface Businessid{
        String REGISTER = "0";
        String RESET_PASSWORD = "1";
        String BIND_EMAIL = "3";
        String UNBAND_EMAIL = "4";
        String UPGRADE_ACCOUNT = "5";
        String OTHER = "99";
    }
    /**
     * 验证码类型：0：短信验证码 1：邮件验证码
     */
    public interface Validtype{
        int MSISDN = 0;
        int EMAIL = 1;
    }
    /**
     * 验证码类型：0：短信验证码 1：邮件验证码
     */
    public interface Algorithm{
        String CLEARTEXT = "0";
    }

    /**
     * 黑白灰名单查询条件字段
     */
    public interface QuerySpecialCondition{
        String PASSID = "passid";
        String MSISDN = "msisdn";
        String EMAIL = "email";
    }

    /**
     * 黑白灰名单状态
     * 0:白名单;1黑名单;2灰名单
     */
    public interface SpecialStatus{
        int WHITE = 0;
        int  BLACK = 1;
        int GRAY = 2;
        int OTHER = 3;
    }

    /**
     * 黑白灰名单类型
     * 0:短信;1:邮件;2:业务投诉
     */
    public interface SpecialType{
        int SMS = 0;
        int  EMAIL = 1;
        int BUSI_COMPLAINT = 2;
    }


    /**
     * product level 产品等级
     */
    public static final int MAJOR_PRODUCT = 1;

    public static final int SUB_PRODUCT = 2;

    /**
     *  弱密码管理类型
     *  0:全词匹配; 1:正则
     */
    public interface WeakPasswordMgmtType{
        String WORDS_MATCH = "0";
        String REGEX = "1";
    }

    // 系统参数类型
    public static final String DICTIONARY_TYPE = "VARCHAR";

    // 系统编码
    public static final String SYSTEM_CODE = "MIGU";

    public interface EffectType{
        String immediate = "0";
        String nextDay = "1";
        String nextMonth = "2";
        String appointedDate = "3";
    }

    /**
     * 调用杭研接口返回resultCode
     */
    public interface ResultCode {
        String SUCCESS = "104000"; //成功
        String PASSWORD_VALIDATE_NOT_PASSED = "104209"; //密码验证未通过
        String EMAIL_ADRESS_ERROR = "104103"; //邮件地址错误
        String USER_NOT_EXIST = "104222"; // 该用户不存在
        String USER_SECRET_QUESTION_NOT_EXIST = "104205"; //该用户密保问题不存在
    }
    /**
     * 用户审核状态
     *
     */
    public interface AccountAppealStatus{
        int ALL = -1;
        int PENDING = 2;//待处理
        int PASS = 1;//审核通过
        int REFUSE = 9;//审核拒绝
    }

    /**
     * 第三方登录方式
     */
    public interface ThirdLoginType {
        String GOOGLE = "5";
        String FACEBOOK = "4";
    }

    /**
     * 获取第三方Token参数
     */
    public interface GetTokenParams {
        String CLIENT_ID = "client_id";
        String CLIENT_SECRET = "client_secret";
        String REDIRECT_URI = "redirect_uri";
        String CODE = "code";
        String GRANT_TYPE = "grant_type";
    }

    // 名称最长16位
    public static final int MAX_NICKNAME_LENGTH = 16;

}
