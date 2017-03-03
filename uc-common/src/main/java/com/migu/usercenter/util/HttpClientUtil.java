/*
 * All rights Reserved, Designed By MiGu
 * Copyright (c) 2017 - 2020
 * Company MiGu Co., Ltd
 */

package com.migu.usercenter.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * function description.
 * <p>
 * <p><h2>Descriptions</h2>
 * <h3>Project</h3> usercenter
 * <h3>Package</h3> com.migu.usercenter.util
 * </p>
 * <p><h2>Change History</h2>
 * 2017/1/11 下午4:35 | guanrongzhi | created
 * </p>
 *
 * @author guanrongzhi
 * @version 1.0.0
 */
public abstract class HttpClientUtil {
    private static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);

    protected static String execute(HttpRequestBase request, CloseableHttpClient httpClient) {
        long start = System.currentTimeMillis();
        String result = null;
        // CloseableHttpClient httpClient = HttpClients.createDefault();
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            // response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // long len = entity.getContentLength();// -1 表示长度未知
                result = EntityUtils.toString(entity);
            }
            logger.info(generateLogInfo(start, request, result));
        } catch (Exception e) {
            logger.error("execute method error : ", e);
            logger.info(generateLogInfo(start, request, result), e);
        }

        return result;
    }

    private static String generateLogInfo(long start, HttpRequestBase httpRequest, String result) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http request, url = ").append(httpRequest.getURI().toString())
                .append(", request method = ").append(httpRequest.getMethod())
                .append(", use time = ").append(System.currentTimeMillis() - start).append(" ms");
        try {
            if (httpRequest.getMethod().equals("POST"))
                stringBuilder.append(", request entity = ").append(EntityUtils.toString(((HttpPost) httpRequest).getEntity()));
        } catch (IOException e) {
            logger.error("get http entity error, ", e);
        }
        stringBuilder.append(", response = ").append(result);

        return stringBuilder.toString();
    }
}
