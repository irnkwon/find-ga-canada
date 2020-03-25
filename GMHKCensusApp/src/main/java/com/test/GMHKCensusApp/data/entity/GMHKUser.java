/*
    GMHKUser.java
    Created by Gongzi Muchang
    Date: 2020-03-25
    Time: 2:48 a.m.
*/
package com.test.GMHKCensusApp.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="USER")
public class GMHKUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USERID")
    private int userID;

    @NotEmpty(message = "User name cannot be empty")
    @Column(name="USERNAME")
    private String username;

    @NotEmpty(message = "Password cannot be empty")
    @Column(name="PASSWORD")
    private String password;

    @NotEmpty(message = "Email cannot be empty")
    @Column(name="EMAIL")
    private String email;

    @Column(name="LASTGEOGRAPHICAREA")
    private int lastGeoArea;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLastGeoArea() {
        return lastGeoArea;
    }

    public void setLastGeoArea(int lastGeoArea) {
        this.lastGeoArea = lastGeoArea;
    }
}
