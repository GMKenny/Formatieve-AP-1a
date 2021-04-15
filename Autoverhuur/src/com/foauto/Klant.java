package com.foauto;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }

    void setKorting(double kP){
        kortingsPercentage = kP;
    }

    double getKorting(){
        return kortingsPercentage;
    }

    public String toString(){
        return "Op naam van: " + naam;
    }

}
