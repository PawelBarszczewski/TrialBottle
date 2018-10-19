package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Butelka;

public class Main {

    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(5);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);

        System.out.println(butelka[0]);
        System.out.println(butelka[1]);
        System.out.println(butelka[2]);

        System.out.println();

        butelka[0].wlej(6);
        butelka[1].wlej(7);

        butelka[0].wylej(2.5);
        butelka[1].przelej(3, butelka[0]);

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());

        System.out.println();
        System.out.println("stan po operacji przelej: ");

        butelka[0].przelej(2, butelka[1]);

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());

    }

}

