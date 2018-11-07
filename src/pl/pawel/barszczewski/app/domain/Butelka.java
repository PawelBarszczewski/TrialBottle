package pl.pawel.barszczewski.app.domain;

public class Butelka {

    private double quantity;                   // określenie ile litrów jest aktualnie w butelce
    private double maxCapacity;                // maksymalna pojemnosc butelki
    private double toFull;                     // ile pozostało do pełnej butelki

    public Butelka(double maxCapacity) {
        this.maxCapacity = maxCapacity;       // this. => odwołanie do aktualnego stanu
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getToFull() {
        return maxCapacity - getQuantity();
    }

    public void fillIn(double quantity) {            // stworzenie metody wlewania do butelki
        if ((getQuantity() + quantity) <= getMaxCapacity()) {
            this.quantity += quantity;
        } else if ((getQuantity() + quantity) > getMaxCapacity()) {
            this.quantity += getToFull();
            System.out.println("fill in to max capacity, " + this.getMaxCapacity());
        } else
            System.out.println("over max capacity, max capacity = " + this.getMaxCapacity());
    }


    public boolean fillOut(double quantity) {           // stworzenie metody wylewania z butelki
        if (quantity < getQuantity()) {
            this.quantity -= quantity;
        } else
            return false;       // w innym wypadku zwróć fałsz
        return true;            // normalnie zwróć prawdę
    }


    public void transfer(double quantity, Butelka where) {
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