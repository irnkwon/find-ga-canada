/*
    GmhkGeographicAreaQueryDemo.java
    Created by Haeryun Kwon
    Date: 2020-03-19
    Time: 8:43 p.m.
*/
package com.test.GMHKCensusApp;

import com.test.GMHKCensusApp.data.repository.GMHKGeographicAreaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmhkGeographicAreaQueryDemo {

    @Autowired
    GMHKGeographicAreaRepository gmhkGeographicAreaRepository;

    @Test
    public void GmhkQueryByLevelZero() {
        System.out.println("*************************************************************************************");
        System.out.println("GmhkQueryByLevelZero(): Find areas with level 0");
        gmhkGeographicAreaRepository.findByLevel(0).forEach(System.out::println);
        System.out.println("*************************************************************************************");
    }

    @Test
    public void GmhkQueryByLevelOne() {
        System.out.println("*************************************************************************************");
        System.out.println("GmhkQueryByLevelOne(): Find areas with level 1");
        gmhkGeographicAreaRepository.findByLevel(1).forEach(System.out::println);
        System.out.println("*************************************************************************************");
    }

    @Test
    public void GmhkQueryByNameOntario() {
        System.out.println("*************************************************************************************");
        System.out.println("GmhkQueryByNameOntario(): Find areas with name: Ontario");
        gmhkGeographicAreaRepository.findByName("Ontario").forEach(System.out::println);
        System.out.println("*************************************************************************************");
    }

    @Test
    public void GmhkQueryByNameLikeLoo() {
        System.out.println("*************************************************************************************");
        System.out.println("GmhkQueryByNameLikeLoo(): Find areas with name like: %Loo%");
        gmhkGeographicAreaRepository.findByNameLike("%Loo%").forEach(System.out::println);
        System.out.println("*************************************************************************************");
    }

}
