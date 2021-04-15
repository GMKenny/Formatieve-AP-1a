package com.game_shop;

import java.util.HashSet;
import java.util.Set;

public class Persoon {
    private String naam;
    private double geld;


    public Persoon(String naam, double geld){
        this.naam = naam;
        this.geld = geld;
    }

    String getNaam(){
        return naam;
    }

    double getGeld(){
        return geld;
    }

    void setGeld(double geld){
        this.geld = geld;
    }

    public String toString(){
        String answer = "\n" + getNaam() + " heeft een budget van " + (Math.round(getGeld() * 100.0) /100.0) + " en bezit de volgende game:\n";
        return answer;
    }

}
