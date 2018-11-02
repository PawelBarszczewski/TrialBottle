package pl.pawel.barszczewski.app.domain;

public class Butelka {

    private double quantity;                   // określenie ile litrów jest aktualnie w butelce
    private double maxCapacity;                // maksymalna pojemnosc butelki

    public Butelka(double maxCapacity) {
        this.maxCapacity = maxCapacity;       // this. => odwołanie do aktualnego stanu
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void fillIn(double quantity) {            // stworzenie metody wlewania do butelki
        if ((getQuantity() + quantity) >= getMaxCapacity()) {
            System.out.println("over max capacity");
        } else
            this.quantity += quantity;
    }

    public boolean fillOut(double quantity) {           // stworzenie metody wylewania z butelki
        if (quantity < getQuantity()) {

            this.quantity -= quantity;
        } else
            return false;       // w innym wypadku zwróć fałsz

        return true;            // normalnie zwróć prawdę
    }


    public void transfer(double quantity, Butelka where) {
        if (this.fillOut(quantity))        // jezeli wylej poszlo ok to =>
        {
            where.fillIn(quantity);

        } else
            System.out.println("full");
    }

    @Override
    public String toString() {
        return "Butelka{" +
                "maxCapacity=" + maxCapacity +
                '}';
    }


}