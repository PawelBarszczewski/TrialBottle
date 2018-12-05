package pl.pawel.barszczewski.app.domain;

public class Bottle {

    private double quantity;                   // określenie ile litrów jest aktualnie w butelce
    private double maxCapacity;                // maksymalna pojemnosc butelki
    private double minCapacity;                     // min pojemoność  = 0
    private double overMax;


    public Bottle(double maxCapacity) {
        this.maxCapacity = maxCapacity;       // this. => odwołanie do aktualnego stanu
    }

    /********************************************
     *                                          *
     *             GETTER and SETTER            *
     *                                          *
     ********************************************/

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

    public double getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(double minCapacity) {
        this.minCapacity = minCapacity;
    }

    public double getOverMax() {
        return overMax;
    }

    public void setOverMax(double overMax) {
        this.overMax = overMax;
    }

    @Override
    public String toString() {
        return "Butelka{" +
                "maxCapacity=" + maxCapacity +
                '}';
    }


}