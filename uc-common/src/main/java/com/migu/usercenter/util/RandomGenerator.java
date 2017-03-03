/*
 * All rights Reserved, Designed By MiGu
 * Copyright (c) 2016 - 2020
 * Company MiGu Co., Ltd
 */

package com.migu.usercenter.util;

/**
 * function description.
 * <p>
 * <p><h2>Descriptions</h2>
 * <h3>Project</h3> UserCenter
 * <h3>Package</h3> com.migu.usercenter.util
 * </p>
 * <p><h2>Change History</h2>
 * 2016/11/30 2:26 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
public class RandomGenerator {
    private static char[] numberChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * generate number code
     *
     * @param length length of the number code
     * @return number code char[]
     */
    public static char[] generateNumCode(int length) {
        // 定义验证码的字符表
        char[] rands = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * 10);
            rands[i] = numberChar[rand];
        }
        return rands;

    }
}
