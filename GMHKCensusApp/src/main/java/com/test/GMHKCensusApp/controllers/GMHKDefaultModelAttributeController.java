/*
    GMHKDefaultModelAttributeController.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 12:12 p.m.
*/
package com.test.GMHKCensusApp.controllers;

import com.test.GMHKCensusApp.data.entity.GMHKLogin;
import com.test.GMHKCensusApp.data.entity.GMHKUser;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GMHKDefaultModelAttributeController {

    @ModelAttribute("login")
    public GMHKLogin getDefaultLogin() {
        return new GMHKLogin();
    }

    @ModelAttribute("newUser")
    public GMHKUser getDefaultUser() {
        return new GMHKUser();
    }

}
