/*
    GMHKAge.java
    Created by Gongzi Muchang
    Date: 2020-03-19
    Time: 8:48 p.m.
*/
package com.test.GMHKCensusApp.data.entity;

import javax.persistence.*;

@Entity
@Table(name="AGE")
public class GMHKAge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AGEID")
    private int ageID;

    @Column(name="AGEGROUP")
    private int ageGroup;

    @Column(name="CENSUSYEAR")
    private int censusYear;

    @ManyToOne
    @JoinColumn(name="GEOGRAPHICAREA")
    private GMHKGeographicArea gmhkGeographicArea;

    @Column(name="COMBINED")
    private int combined;

    @Column(name="MALE")
    private int male;

    @Column(name="FEMALE")
    private int female;

    public int getAgeID() {
        return ageID;
    }

    public void setAgeID(int ageID) {
        this.ageID = ageID;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(int censusYear) {
        this.censusYear = censusYear;
    }

    public GMHKGeographicArea getGmhkGeographicArea() {
        return gmhkGeographicArea;
    }

    public void setGeographicArea(GMHKGeographicArea gmhkGeographicArea) {
        this.gmhkGeographicArea = gmhkGeographicArea;
    }

    public int getCombined() {
        return combined;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    @Override
    public String toString() {
        return "Age group, year, Geographic Area ID: " + ageGroup + ", " +
            censusYear + ", " + gmhkGeographicArea.getGeographicAreaID() + " ( Age ID: " + ageID + " )\n" +
            "> Population: combined, male, female: " + combined + ", " + male + ", " + female;
    }
}
