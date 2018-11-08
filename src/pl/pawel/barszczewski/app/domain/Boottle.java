package pl.pawel.barszczewski.app.domain;

public class Boottle{

    private double quantity;                   // określenie ile litrów jest aktualnie w butelce
    private double maxCapacity;                // maksymalna pojemnosc butelki
    private double toFull;                     // ile pozostało do pełnej butelki

    public Boottle(double maxCapacity) {
        this.maxCapacity = maxCapacity;       // this. => odwołanie do aktualnego stanu
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getToFull() {
        return maxCapacity - quantity;
    }

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
    }


    @Override
    public String toString() {
        return "Butelka{" +
                "maxCapacity=" + maxCapacity +
                '}';
    }


}