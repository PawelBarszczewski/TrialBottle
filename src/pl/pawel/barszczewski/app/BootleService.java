package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Bottle;

public class BootleService {


    public boolean fillIn(Bottle bottle, double quantity) {            // shift + ctrl + M =>  Extract Method
        if (verifyBelow(bottle, quantity)) {
            bottle.setQuantity(bottle.getQuantity() + quantity);
        } else if (verifyAbowe(bottle, quantity)) {
            System.out.println("over max, max capacity = " + bottle.getMaxCapacity());
        } else
            bottle.setQuantity(bottle.getQuantity() + quantity);
        return false;
    }
    // zrobić, zeby zwracało to co jest wlewane ponad pojemność


    public void fillOut(Bottle bootle, double quantity) {
        if (verifyEmpty(bootle, quantity)) {
            bootle.setQuantity(bootle.getMinCapacity());
            System.out.println("boottle is empty");
        } else
            bootle.setQuantity(bootle.getQuantity() - quantity);
    }

    private boolean verifyAbowe(Bottle bottle, double quantity) {
        if (bottle.getQuantity() + quantity > bottle.getMaxCapacity()) {
            bottle.setQuantity(bottle.getMaxCapacity());
            System.out.println("over max capacity " + bottle.getMaxCapacity());
        }
        return false;
    }

    private boolean verifyBelow(Bottle bottle, double quantity) {
        return bottle.getQuantity() + quantity <= bottle.getMaxCapacity();
    }

    private boolean verifyEmpty(Bottle bottle, double quantity) {
        return bottle.getQuantity() - quantity < 0;
    }

    public void transfer(Bottle from, Bottle to, double quantity) {
        if (verifyEmpty(from, quantity)) {
            fillOut(from, quantity);
        } else if (verifyAbowe(to, quantity)) {
            fillIn(to, quantity);
        } else System.out.println("error");
    }

     /* from.setQuantity(from.getQuantity() - quantity);
        to.setQuantity(to.getQuantity() + quantity); */


    public Bottle createBootle(double capacity) {

        return new Bottle(capacity);
    }

}
