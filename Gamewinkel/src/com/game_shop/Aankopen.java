package com.game_shop;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Aankopen {
    private Persoon persoon;
    private Set<Game> games = new HashSet<>();

    public Aankopen(Persoon persoon){
        this.persoon = persoon;
    }

    double gameKorting(Game game){
        int jaren = LocalDate.now().getYear() - game.getReleaseJaar();
        return Math.floor(Math.pow(0.70, jaren) * game.getPrijs() * 100) / 100;
    }

    public boolean controlenGame(Game game) {
        for (Game games : games ) {
            if (games.getNaam().equals(game.getNaam())){
                return true;
            }
        }
        return false;
    }

    String kopen(Game game) {
        if (persoon.getGeld() - game.getPrijs() > 0 && !controlenGame(game)) {
            persoon.setGeld(persoon.getGeld() - gameKorting(game));
            games.add(game);
            return persoon.getNaam() + " koopt " + game.getNaam() + ": gelukt";
        } else {
            return persoon.getNaam() + " koopt " + game.getNaam() + ": niet gelukt";
        }
    }

    String verkoop(Game game, Aankopen aankopen){

        String response = persoon.getNaam() + " verkoopt " + game.getNaam() + " aan " + aankopen.persoon.getNaam();
        if (aankopen.persoon.getGeld() - gameKorting(game) > 0 && !aankopen.controlenGame(game)) {
            persoon.setGeld(persoon.getGeld() + gameKorting(game));
            aankopen.persoon.setGeld(aankopen.persoon.getGeld() - gameKorting(game));
            aankopen.games.add(game);
            return response + ": gelukt";
        } else {
            return response + ": niet gelukt";
        }
    }

    public String toSting(){
        String answer = persoon.toString();
        for (Game games : games ) {
            answer += games.getNaam() + ", uitgegeven in " + games.getReleaseJaar() + "; nieuweprijs: " +
                    games.getPrijs() + " nu voor: €" +   gameKorting(games) + "\n";
        }
        return answer;
    }

}
