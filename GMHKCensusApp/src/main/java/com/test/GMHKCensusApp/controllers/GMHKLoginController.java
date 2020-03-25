/*
    GMHKLoginController.java
    Created by Gongzi Muchang
    Date: 2020-03-25
    Time: 2:38 a.m.
*/
package com.test.GMHKCensusApp.controllers;

import com.test.GMHKCensusApp.data.entity.GMHKLogin;
import com.test.GMHKCensusApp.data.entity.GMHKUser;
import com.test.GMHKCensusApp.data.repository.GMHKUserRepository;
import com.test.GMHKCensusApp.exceptions.GMHKApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("login")
public class GMHKLoginController {

    @Autowired
    private GMHKUserRepository gmhkUserRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") GMHKLogin gmhkLogin, HttpSession session) {

        GMHKUser gmhkUser = gmhkUserRepository.searchByEmail(gmhkLogin.getEmail());
        if (gmhkUser == null) {
            throw new GMHKApplicationException("No user is found");
        }
        session.setAttribute("user", gmhkUser);
        return "GMHKHome"; // forward:/userprofile

    }

    @ExceptionHandler(GMHKApplicationException.class)
    public String handleException() {
        return "GMHKLogin";
    }
}
