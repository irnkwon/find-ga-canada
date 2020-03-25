/*
    GMHKHomeController.java
    Created by Haeryun Kwon
    Date: 2020-02-18
    Time: 12:24 p.m.
*/
package com.test.GMHKCensusApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GMHKHomeController {
    @GetMapping("/home")
    public String goToHomePage() { return "GMHKHome"; }

    @GetMapping("/level")
    public String goToLevelPage() {
        return "GMHKFindGeoAreaByLevel";
    }

    @GetMapping("/keyword")
    public String goToKeywordPage() {
        return "GMHKFindGeoAreaByKeyword";
    }

    @GetMapping("/login")
    public String goToLoginPage() {
        return "GMHKLogin";
    }

    @GetMapping("/register")
    public String goToRegisterPage() {
        return "GMHKRegister";
    }
}
