package com.foauto;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPD){
        type = tp;
        prijsPerDag = prPD;
    }

    void setPrijsPerDag(double perDag){
        prijsPerDag = perDag;
    }

    double getPrijsPerDag(){
        return prijsPerDag;
    }

    public String toString(){
        return "Autotype: " + type;
    }



}
