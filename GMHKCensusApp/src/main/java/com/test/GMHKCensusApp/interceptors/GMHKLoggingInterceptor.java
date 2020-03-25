/*
    GMHKLoggingInterceptor.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 2:42 a.m.
*/
package com.test.GMHKCensusApp.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GMHKLoggingInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String sessionId = null;
        if (null != request.getCookies()) {
            for (Cookie cookie : request.getCookies()) {
                if ("JSESSIONID".equals(cookie.getName())) {
                    sessionId = cookie.getValue();
                }
            }
        }
        return true;
    }
}
