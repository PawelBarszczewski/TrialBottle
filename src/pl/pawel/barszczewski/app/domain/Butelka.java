package pl.pawel.barszczewski.app.domain;

public class Butelka {

    private double ileLitrow;                   // określenie ile litrów jest aktualnie w butelce
    private double maxPojemnosc;                // maksymalna pojemnosc butelki

    public Butelka(double maxPojemnosc) {
        this.maxPojemnosc = maxPojemnosc;       // this. => odwołanie do aktualnego stanu
    }

    public double getMaxPojemnosc() {
        return maxPojemnosc;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

    public void wlej(double ilosc) {            // stworzenie metody wlewania do butelki
        this.ileLitrow += ilosc;
    }

    public void wylej(double ilosc) {           // stworzenie metody wylewania z butelki
        this.ileLitrow -= ilosc;
    }

    public void przelej(double ilosc, Butelka gdziePrzelac) {
        this.wylej(ilosc);
        gdziePrzelac.wlej(ilosc);

    }


    @Override                                   // Generate -> toString()
    public String toString() {
        return "Butelka{" +
                "max pojemność butli = " + maxPojemnosc +
                '}';
    }

}



