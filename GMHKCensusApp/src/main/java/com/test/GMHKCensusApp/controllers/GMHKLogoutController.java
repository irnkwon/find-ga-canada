/*
    GMHKLogoutController.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 4:27 a.m.
*/
package com.test.GMHKCensusApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class GMHKLogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "GMHKLogin";
    }
}
