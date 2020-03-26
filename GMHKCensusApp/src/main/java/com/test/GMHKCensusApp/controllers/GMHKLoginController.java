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
import org.springframework.ui.Model;
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
    public String login(@ModelAttribute("login") GMHKLogin gmhkLogin, HttpSession session, Model model) {

        GMHKUser gmhkUser = gmhkUserRepository.searchByEmail(gmhkLogin.getEmail(), gmhkLogin.getPassword());
        if (gmhkUser == null) {
            model.addAttribute("loginMsg", "The username or password you entered is incorrect.");
            return "GMHKLogin";
        }
        session.setAttribute("user", gmhkUser);
        return "GMHKHome"; // forward:/userprofile

    }
}
