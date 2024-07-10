package de.brandenburg.th.se.pizzeria.domain.speisekarte;

import java.util.ArrayList;

public class Dessert extends Gericht {

    public Dessert(int nummer, String id, Groesse groesse) {
        super(nummer, id, groesse);
    }

    @Override
    protected int berechnePreis() {
        int gesamtPreis = 0;
        for (Zutat zutat : zutaten) {
            gesamtPreis += zutat.getPreis();
        }
        return gesamtPreis;
    }
}