package de.brandenburg.th.se.pizzeria.domain.speisekarte;

public class Speise {

    private String name;
    private float preis;

    public Speise(String name, float preis) {
        this.name = name;
        this.preis = preis;
    }


    public String getName() {
        return this.name;
    }

    public float getPreis() {
        return this.preis;

    }
}