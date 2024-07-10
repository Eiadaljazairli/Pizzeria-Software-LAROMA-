package de.brandenburg.th.se.pizzeria.domain;

import de.brandenburg.th.se.pizzeria.domain.speisekarte.*;

public class Pizzeria {

    public static void main(String[] args) {

        Speisekarte karte = new Speisekarte("Speisekarte");
        System.out.println(karte);
        Pizza pizza = new Pizza(1, "Margharita",new Groesse("20 CM"));
        karte.addGericht(pizza);
        Pasta pasta = new Pasta(1,"Scampi",new Groesse("mittel"));
        karte.addGericht(pasta);
        Dessert dessert = new Dessert(1,"Taramiso",new Groesse("mittel"));
        karte.addGericht(dessert);
        System.out.println(karte);
    }
}
