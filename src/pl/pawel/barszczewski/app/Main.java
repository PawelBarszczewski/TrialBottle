package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Bottle;

public class Main {

    public static void main(String[] args) {
        BootleService bootleService = new BootleService();

        Bottle[] bottle = new Bottle[3];

        bottle[0] = bootleService.createBootle(5);
        bottle[1] = bootleService.createBootle(5);
        bottle[2] = bootleService.createBootle(10);


        bootleService.fillIn(bottle[0], 4.5);
        bootleService.fillIn(bottle[1], 3);
        bootleService.fillIn(bottle[2], 1.5);

        System.out.println("po napelnieniu =>");
        System.out.println("bottle 1 -> " + bottle[0].getQuantity());
        System.out.println("bottle 2 -> " + bottle[1].getQuantity());
        System.out.println("bottle 3 -> " + bottle[2].getQuantity());
        System.out.println();


        bootleService.transfer(bottle[0], bottle[1], 3.5);
       // bootleService.fillIn(bottle[1], 0.5);

        System.out.println("po operacjach =>");
        System.out.println("bottle 1 -> " + bottle[0].getQuantity());
        System.out.println("bottle 2 -> " + bottle[1].getQuantity());
        System.out.println("bottle 3 -> " + bottle[2].getQuantity());
        System.out.println();
    }

}
