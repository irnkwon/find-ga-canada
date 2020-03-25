/*
    GMHKAgeRepository.java
    Created by Haeryun Kwon
    Date: 2020-03-19
    Time: 9:09 p.m.
*/
package com.test.GMHKCensusApp.data.repository;

import com.test.GMHKCensusApp.data.entity.GMHKAge;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GMHKAgeRepository
    extends CrudRepository<GMHKAge, Integer> {

    @Query(value="SELECT * FROM age WHERE censusYear = 1 " +
        "AND ageGroup = 1 AND geographicArea = (SELECT geographicAreaID " +
        "FROM geographicarea WHERE alternativeCode = ?1)", nativeQuery = true)
    List<GMHKAge> findByGeographicAreaAltCode(int altCode);

}