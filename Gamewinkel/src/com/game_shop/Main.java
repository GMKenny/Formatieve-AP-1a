package com.game_shop;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);

//// Druk de volgende transacties af (pas de code aan)
        Aankopen p1Aankopen = new Aankopen(p1);
        System.out.println(p1Aankopen.kopen(g1));
        System.out.println(p1Aankopen.kopen(g2));
        System.out.println(p1Aankopen.kopen(g3));

        Aankopen p2Aankopen = new Aankopen(p2);
        System.out.println(p2Aankopen.kopen(g2));
        System.out.println(p2Aankopen.kopen(g1));

        Aankopen p3Aankopen = new Aankopen(p3);
        System.out.println(p3Aankopen.kopen(g3));


        System.out.println(p1Aankopen.toSting());
        System.out.println(p2Aankopen.toSting());
        System.out.println(p3Aankopen.toSting());


//// Druk de volgende transacties af (pas de code aan)
        System.out.println(p1Aankopen.verkoop(g1, p3Aankopen));
        System.out.println(p2Aankopen.verkoop(g2, p3Aankopen));
        System.out.println(p2Aankopen.verkoop(g1, p1Aankopen));

        System.out.println(p1Aankopen.toSting());
        System.out.println(p2Aankopen.toSting());
        System.out.println(p3Aankopen.toSting());

    }
}
