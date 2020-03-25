/*
    GMHKGeographicArea.java
    Created by Gongzi Muchang
    Date: 2020-03-19
    Time: 8:28 p.m.
*/
package com.test.GMHKCensusApp.data.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="GEOGRAPHICAREA")
public class GMHKGeographicArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="GEOGRAPHICAREAID")
    private int geographicAreaID;

    @Column(name="CODE")
    private int code;

    @Column(name="LEVEL")
    private int level;

    @Column(name="NAME")
    private String name;

    @Column(name="ALTERNATIVECODE")
    private int alternativeCode;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "gmhkGeographicArea", cascade = CascadeType.ALL)
    private List<GMHKAge> ages;

    public GMHKGeographicArea() { }

    public GMHKGeographicArea(int geographicAreaID) {
        this.geographicAreaID = geographicAreaID;
    }

    public int getGeographicAreaID() {
        return geographicAreaID;
    }

    public void setGeographicAreaID(int geographicAreaID) {
        this.geographicAreaID = geographicAreaID;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(int alternativeCode) {
        this.alternativeCode = alternativeCode;
    }

    @Override
    public String toString() {
        return "Area name, alternative code: " + name + ", " + alternativeCode + " ( ID: " + geographicAreaID + " )";
    }
}

