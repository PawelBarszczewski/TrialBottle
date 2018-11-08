package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Boottle;

public class Main {

    public static void main(String[] args) {
        Boottle[] boottle = new Boottle[3];

        boottle[0] = new Boottle(5);
        boottle[1] = new Boottle(8);
        boottle[2] = new Boottle(10);


        boottle[0].fillIn(5);
        boottle[1].fillIn(7);
        boottle[2].fillIn(6);

        System.out.println("boottle 1 -> " + boottle[0].getQuantity());
        System.out.println("boottle 2 -> " + boottle[1].getQuantity());
        System.out.println("boottle 3 -> " + boottle[0].getQuantity());
        System.out.println();
        System.out.println();

        boottle[0].transfer(1, boottle[1]);
        boottle[1].transfer(5.5, boottle[2]);

        System.out.println("boottle 1 -> " + boottle[0].getQuantity());
        System.out.println("boottle 2 -> " + boottle[1].getQuantity());
        System.out.println("boottle 3 -> " + boottle[2].getQuantity());
        System.out.println();
    }

}
