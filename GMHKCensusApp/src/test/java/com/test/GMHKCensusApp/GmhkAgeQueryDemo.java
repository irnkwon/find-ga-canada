/*
    GmhkAgeQueryDemo.java
    Created by Haeryun Kwon
    Date: 2020-03-19
    Time: 8:57 p.m.
*/
package com.test.GMHKCensusApp;

import com.test.GMHKCensusApp.data.repository.GMHKAgeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmhkAgeQueryDemo {

    @Autowired
    GMHKAgeRepository gmhkAgeRepository;

    @Test
    public void GmhkQueryByAltCode1() {
        System.out.println("*************************************************************************************");
        System.out.println("GmhkQueryByAltCode1(): Find ages records with AltCode 1 (Canada)");
        int elementNums = gmhkAgeRepository.findByGeographicAreaAltCode(1).size();
        System.out.println("Number of elements to display: " + elementNums);
        gmhkAgeRepository.findByGeographicAreaAltCode(1).forEach(System.out::println);
        System.out.println("*************************************************************************************");
    }

    @Test
    public void GmhkQueryByAltCode35541() {
        System.out.println("*************************************************************************************");
        System.out.println("GmhkQueryByAltCode35541(): Find ages records with AltCode 35541 (KW-Cambridge)");
        int elementNums = gmhkAgeRepository.findByGeographicAreaAltCode(1).size();
        System.out.println("Number of elements to display: " + elementNums);
        gmhkAgeRepository.findByGeographicAreaAltCode(35541).forEach(System.out::println);
        System.out.println("*************************************************************************************");
    }

}
