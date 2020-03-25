/*
    GMHKApplicationExceptionHandler.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 4:08 a.m.
*/
package com.test.GMHKCensusApp.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

@ControllerAdvice
public class GMHKApplicationExceptionHandler {
    @ExceptionHandler({GMHKApplicationException.class, AsyncRequestTimeoutException.class})
    public String handleException() {
        return "GMHKLogin";
    }
}
