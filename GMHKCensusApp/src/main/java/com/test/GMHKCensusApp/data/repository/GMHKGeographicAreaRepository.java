/*
    GMHKGeographicAreaRepository.java
    Created by Gongzi Muchang
    Date: 2020-03-19
    Time: 8:41 p.m.
*/
package com.test.GMHKCensusApp.data.repository;

import com.test.GMHKCensusApp.data.entity.GMHKGeographicArea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GMHKGeographicAreaRepository
    extends CrudRepository<GMHKGeographicArea, Integer> {

    List<GMHKGeographicArea> findByLevel(int level);
    List<GMHKGeographicArea> findByName(String name);
    List<GMHKGeographicArea> findByNameLike(String likeString);

}
