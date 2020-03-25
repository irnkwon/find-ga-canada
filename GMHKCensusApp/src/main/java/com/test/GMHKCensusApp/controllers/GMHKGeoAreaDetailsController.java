/*
    GMHKGeoAreaDetailsController.java
    Created by Haeryun Kwon
    Date: 2020-02-18
    Time: 12:12 p.m.
*/
package com.test.GMHKCensusApp.controllers;

import com.test.GMHKCensusApp.data.entity.GMHKAge;
import com.test.GMHKCensusApp.data.repository.GMHKAgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class GMHKGeoAreaDetailsController {

    @Autowired
    private GMHKAgeRepository gmhkAgeRepository;

    @GetMapping("/details")
    public String showDetails(@RequestParam("name") String name,
        @RequestParam("code") int code, @RequestParam("altCode") int altCode,
        @RequestParam("level") int level, @RequestParam("geoAreaId") int geoAreaId,
        Model model) {

        model.addAttribute("name", name.replaceAll("[+]", " "));
        model.addAttribute("code", code);
        model.addAttribute("altCode", altCode);
        model.addAttribute("level", level);
        model.addAttribute("geoAreaId", geoAreaId);

        List<GMHKAge> ages;
        ages = gmhkAgeRepository.findByGeographicAreaAltCode(altCode);
        model.addAttribute("ages", ages);
        return "GMHKGeoAreaDetails";
    }
}
