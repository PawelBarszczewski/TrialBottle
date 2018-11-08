package pl.pawel.barszczewski.app;

import pl.pawel.barszczewski.app.domain.Bottle;

public class BootleService {


    public void fillIn(Bottle bottle, double quantity) {            // shift + ctrl + M =>  Extract Method => refaktoring kodu
        // bottle.setQuantity(quantity);
        if (verifyBelow(bottle, quantity)) {
            bottle.setQuantity(quantity);
        } else if (verifyAbowe(bottle, quantity)) {

            System.out.println("over max, max capacity = " + bottle.getMaxCapacity());
        }
    }

    public void fillOut(Bottle bootle, double quantity) {
        bootle.setQuantity(bootle.getQuantity() - quantity);
    }


    private boolean verifyAbowe(Bottle bottle, double quantity) {
        if (bottle.getQuantity() + quantity > bottle.getMaxCapacity()) ;
        {
            bottle.getToFull();
            System.out.println("over max capacity " + bottle.getMaxCapacity());
        }
        return false;
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
