/*
    GMHKFindGeoAreaByLevelController.java
    Created by Gongzi Muchang
    Date: 2020-02-18
    Time: 5:29 a.m.
*/
package com.test.GMHKCensusApp.controllers;

import com.test.GMHKCensusApp.data.entity.GMHKGeographicArea;
import com.test.GMHKCensusApp.data.repository.GMHKGeographicAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GMHKFindGeoAreaByLevelController {

    @Autowired
    private GMHKGeographicAreaRepository gmhkGeographicAreaRepository;

    @GetMapping("/findByLevel")
    public String findByLevel(@RequestParam("level") int level, Model model) {
        List<GMHKGeographicArea> geoAreas;
        geoAreas = gmhkGeographicAreaRepository.findByLevel(level);
        model.addAttribute("geoAreas", geoAreas);
        return "GMHKFindGeoAreaByLevel";
    }

}
