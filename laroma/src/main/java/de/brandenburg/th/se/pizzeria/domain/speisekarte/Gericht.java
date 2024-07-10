package de.brandenburg.th.se.pizzeria.domain.speisekarte;

import java.util.ArrayList;

public abstract class Gericht {
    protected ArrayList<Zutat> zutaten;
    protected int preis;
    protected int nummer;
    protected String id;
    protected Groesse groesse;

    public Gericht(int nummer, String id,  Groesse groesse) {
        this.zutaten = new ArrayList<>();
        this.nummer = nummer;
        this.id = id;
        this.groesse = groesse;
        this.preis = berechnePreis();
    }

    public void zutatHinzufuegen(Zutat zutat) {
        this.zutaten.add(zutat);
        this.preis += zutat.getPreis();
    }

    public ArrayList<Zutat> getZutaten() {
        return zutaten;
    }

    public int getPreis() {
        return preis;
    }

    public int getNummer() {
        return nummer;
    }

    public String getId() {
        return id;
    }



    public Groesse getGroesse() {
        return groesse;
    }

    @Override
    public String toString() {
        return "Gericht{" +
                "zutaten=" + zutaten +
                ", preis=" + preis +
                ", nummer=" + nummer +
                ", id='" + id + '\'' +

                ", groesse=" + groesse +
                '}';
    }


    protected abstract int berechnePreis();
}
