package com.foauto;

public class AutoHuur {
    int aantalDagen;
    Klant huurder;
    Auto gehuurdeAuto;

    void setAantalDagen(int aD){
        aantalDagen = aD;
    }

    void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }

    Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    void setHuurder(Klant k){
        this.huurder = k;
    }

    Klant getHuurder(){
        return huurder;
    }

    double totaalPrijs(){
        return (this.gehuurdeAuto.getPrijsPerDag() * aantalDagen) - (this.gehuurdeAuto.getPrijsPerDag() * (this.huurder.getKorting() * 0.01* aantalDagen));
    }

    public String toString(){
        String answer;
        String answer_attach;
        if (getGehuurdeAuto() == null){
            answer = "Er is geen auto bekend\n";
            answer_attach = "Aantal dagen: 0 en dat kost 0.0\n";
        }else{
            answer = gehuurdeAuto.toString() + " met prijs per dag: " +  gehuurdeAuto.getPrijsPerDag() + "\n";
            answer_attach = "Aantal dagen " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        }

        if (getHuurder() == null){
            answer += "Er is geen huurder bekend\n";
        }else{
            answer += huurder.toString() + " (korting: " + huurder.getKorting() + "%)\n";
        }
        answer += answer_attach;

        return answer;
    }


}
