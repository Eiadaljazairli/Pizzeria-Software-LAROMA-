package de.brandenburg.th.se.pizzeria.domain.speisekarte;

public class Zutat {
    private String name;
    private int preis;

    public Zutat(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Zutat{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }
}
