/*
    GMHKGeoAreaDetailsController.java
    Created by Haeryun Kwon
    Date: 2020-02-18
    Time: 12:12 p.m.
*/
package com.test.GMHKCensusApp.controllers;

import com.test.GMHKCensusApp.data.entity.GMHKAge;
import com.test.GMHKCensusApp.data.entity.GMHKUser;
import com.test.GMHKCensusApp.data.repository.GMHKAgeRepository;
import com.test.GMHKCensusApp.data.repository.GMHKUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GMHKGeoAreaDetailsController {

    @Autowired
    private GMHKAgeRepository gmhkAgeRepository;

    @Autowired
    GMHKUserRepository gmhkUserRepository;

    @GetMapping("/details")
    public String showDetails(@RequestParam("altCode") int altCode,
        Model model, HttpSession session, GMHKUser gmhkUser) {

        if (session.getAttribute("user") == null) {
            return "GMHKLogin";
        }

        gmhkUser = (GMHKUser) session.getAttribute("user");
        gmhkUser.setLastGeoArea(altCode);
        gmhkUserRepository.save(gmhkUser);

        List<GMHKAge> ages;
        ages = gmhkAgeRepository.findByGeographicAreaAltCode(altCode);
        model.addAttribute("ages", ages);
        return "GMHKGeoAreaDetails";
    }
}
