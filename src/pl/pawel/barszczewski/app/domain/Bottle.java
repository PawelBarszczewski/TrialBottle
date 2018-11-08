package pl.pawel.barszczewski.app.domain;

public class Bottle {

    private double quantity;                   // określenie ile litrów jest aktualnie w butelce
    private double maxCapacity;                // maksymalna pojemnosc butelki
    public double getToFull;

    public Bottle(double maxCapacity) {
        this.maxCapacity = maxCapacity;       // this. => odwołanie do aktualnego stanu
    }

    /********************************************
     *                                          *
     *             GETTER and SETTER            *
     *                                          *
     *******************************************/

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void getToFull() {
        this.quantity += maxCapacity;
    }


/* before refactor:
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
    */

    @Override
    public String toString() {
        return "Butelka{" +
                "maxCapacity=" + maxCapacity +
                '}';
    }


}