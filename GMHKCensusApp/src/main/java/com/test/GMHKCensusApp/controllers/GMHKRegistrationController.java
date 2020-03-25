/*
    GMHKRegistrationController.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 4:31 a.m.
*/
package com.test.GMHKCensusApp.controllers;

import com.test.GMHKCensusApp.data.entity.GMHKUser;
import com.test.GMHKCensusApp.data.repository.GMHKUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class GMHKRegistrationController {

    @Autowired
    GMHKUserRepository gmhkUserRepository;

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser")GMHKUser gmhkUser, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "GMHKRegister";
        }
        gmhkUserRepository.save(gmhkUser);
        model.addAttribute("registerMsg", "You have successfully registered!");
        return "GMHKRegister";
    }

}
