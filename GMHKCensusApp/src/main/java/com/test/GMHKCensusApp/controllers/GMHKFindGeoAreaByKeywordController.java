/*
    GMHKFindGeoAreaByKeywordController.java
    Created by Gongzi Muchang
    Date: 2020-02-18
    Time: 7:03 a.m.
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
public class GMHKFindGeoAreaByKeywordController {

    @Autowired
    private GMHKGeographicAreaRepository gmhkGeographicAreaRepository;

    @GetMapping("/findByKeyword")
    public String findByKeyword(@RequestParam("keyword") String keyword, Model model) {
        List<GMHKGeographicArea> geoAreas;
        geoAreas = gmhkGeographicAreaRepository.findByNameLike("%" + keyword + "%");
        model.addAttribute("geoAreas", geoAreas);
        return "GMHKFindGeoAreaByKeyword";
    }

}
