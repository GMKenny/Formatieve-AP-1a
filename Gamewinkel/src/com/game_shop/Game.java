package com.game_shop;

public class Game {
    private String naam;
    private int releaseJaar;
    private double prijs;

    public Game(String naam, int releaseJaar, double prijs){
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.prijs = prijs;
    }

    public String getNaam(){
        return naam;
    }

    int getReleaseJaar(){
        return releaseJaar;
    }

    double getPrijs(){
        return prijs;
    }

}
