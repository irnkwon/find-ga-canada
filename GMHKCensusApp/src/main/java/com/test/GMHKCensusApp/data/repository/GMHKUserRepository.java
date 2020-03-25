/*
    GMHKUserRepository.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 3:04 a.m.
*/
package com.test.GMHKCensusApp.data.repository;

import com.test.GMHKCensusApp.data.entity.GMHKUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface GMHKUserRepository
    extends CrudRepository<GMHKUser, Integer> {

    @Query("select u from GMHKUser u where u.email = :email")
    GMHKUser searchByEmail(@Param("email") String EmailAddress);

}
