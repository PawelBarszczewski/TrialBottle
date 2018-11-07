package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Butelka;

public class Main {

    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(5);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);


        butelka[0].fillIn(8);
        butelka[1].fillIn(3);

        System.out.println("butelka 1 -> " + butelka[0].getQuantity());
        System.out.println("butelka 2 -> " + butelka[1].getQuantity());
        System.out.println();


        butelka[0].transfer(2.5,butelka[1]);

        System.out.println("butelka 1 -> " + butelka[0].getQuantity());
        System.out.println("butelka 2 -> " + butelka[1].getQuantity());
        System.out.println();


    }

}

