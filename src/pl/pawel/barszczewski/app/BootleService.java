package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Bottle;

public class BootleService {


    public void fillIn(Bottle bottle, double quantity) {
        bottle.setQuantity(quantity);
        if (verifyAbowe(bottle, quantity)) {                // shift + ctrl + M =>  Extract Method => refaktoring kodu
            System.out.println("over max, max capacity = " + bottle.getMaxCapacity());
        } else if (verifyBelow(bottle, quantity)) {
            bottle.getToFull();
        }
    }


    private boolean verifyAbowe(Bottle bottle, double quantity) {
        return bottle.getQuantity() + quantity > bottle.getMaxCapacity();
    }

    private boolean verifyBelow(Bottle bottle, double quantity) {
        return bottle.getQuantity() + quantity <= bottle.getMaxCapacity();
    }


    public void transfer(Bottle from, Bottle to, double quantity) {
        from.setQuantity(from.getQuantity() - quantity);
        to.setQuantity(to.getQuantity() + quantity);
    }


/* before refactor:
        public void fillIn(double quantity) {            // stworzenie metody wlewania do butelki
        if ((getQuantity() + quantity) > getMaxCapacity()) {
            this.quantity += getToFull();
            System.out.println("warning, max capacity = " + this.getMaxCapacity());
        } else if ((getQuantity() + quantity) <= getMaxCapacity()) {
            this.quantity += quantity;
        }
    }

    public boolean fillOut(double quantity) {           // stworzenie metody wylewania z butelki
        if (quantity <= getQuantity()) {
            this.quantity -= quantity;
        } else
            System.out.println("bootle is empty");       // w innym wypadku zwróć fałsz
        return true;                                    // normalnie zwróć prawdę
    }

    public void transfer(double quantity, Boottle where) {
        if (this.fillOut(quantity)) {
            where.fillIn(quantity);
        }

*/

    public Bottle createBootle(double capacity) {
        return new Bottle(capacity);
    }

}
