package de.brandenburg.th.se.pizzeria.domain.speisekarte;

import java.util.ArrayList;

public class Pizza extends Gericht {

    public Pizza(int nummer, String id, Groesse groesse) {
        super(nummer, id, groesse);
    }

    @Override
    public void zutatHinzufuegen(Zutat zutat) {
        super.zutatHinzufuegen(zutat);
    }

    public void werfen() {
        throw new UnsupportedOperationException("Diese Methode ist noch nicht implementiert.");
    }

    public void setGroesse(Groesse groesse) {
        this.groesse = groesse;
        this.preis = berechnePreis();
    }

    @Override
    protected int berechnePreis() {
        int gesamtPreis = 0;
        for (Zutat zutat : zutaten) {
            gesamtPreis += zutat.getPreis();
        }
        return gesamtPreis;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nummer=" + nummer +
                ", id='" + id + '\'' +
                ", groesse=" + groesse +
                ", preis=" + preis +
                ", zutaten=" + zutaten +
                '}';
    }
}
