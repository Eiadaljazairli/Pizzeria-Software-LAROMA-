package de.brandenburg.th.se.pizzeria.domain.speisekarte;

import java.util.ArrayList;

public class Pasta extends Gericht {

    public Pasta(int nummer, String id,  Groesse groesse) {
        super(nummer, id,  groesse);
    }

    public void parmesanHinzufuegen(Zutat parmesan) {
        if ("Parmesan".equals(parmesan.getName())) {
            this.zutatHinzufuegen(parmesan);
        } else {
            throw new IllegalArgumentException("Nur Parmesan kann mit dieser Methode hinzugefügt werden.");
        }
    }

    @Override
    public void zutatHinzufuegen(Zutat zutat) {
        super.zutatHinzufuegen(zutat);
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
