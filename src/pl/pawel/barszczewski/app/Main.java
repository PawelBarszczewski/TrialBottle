package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Bottle;

public class Main {

    public static void main(String[] args) {
        BootleService bootleService = new BootleService();

        Bottle[] bottle = new Bottle[3];

        bottle[0] = bootleService.createBootle(5);
        bottle[1] = bootleService.createBootle(8);
        bottle[2] = bootleService.createBootle(10);


        bootleService.fillIn(bottle[0], 8.5);
        bootleService.fillOut(bottle[0], 5.5);


        System.out.println("bottle 1 -> " + bottle[0].getQuantity());
        System.out.println("bottle 2 -> " + bottle[1].getQuantity());
        System.out.println();


      /*  bootleService.fillOut(bottle[0], 5.5);

        System.out.println("bottle 1 -> " + bottle[0].getQuantity());
        System.out.println();*/


    }

}
