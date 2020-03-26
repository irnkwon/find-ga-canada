/*
    GMHKLogin.java
    Created by Haeryun Kwon
    Date: 2020-03-25
    Time: 3:12 a.m.
*/
package com.test.GMHKCensusApp.data.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Table(name="USER")
public class GMHKLogin {

    @NotEmpty(message = "Email cannot be empty")
    @Column(name="EMAIL")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    @Column(name="PASSWORD")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
