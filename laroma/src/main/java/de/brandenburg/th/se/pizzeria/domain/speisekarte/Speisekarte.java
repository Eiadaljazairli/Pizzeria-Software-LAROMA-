package de.brandenburg.th.se.pizzeria.domain.speisekarte;

import java.util.ArrayList;

public class Speisekarte {

    private ArrayList<Gericht> pizzas;
    private ArrayList<Gericht> pastas;
    private ArrayList<Gericht> desserts;

    private String name;

    public Speisekarte(String name) {

        this.name = name;
        this.pizzas = new ArrayList<>();
        this.pastas = new ArrayList<>();
        this.desserts = new ArrayList<>();

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name).append(":\n");
        builder.append("Pizzas").append("\n");
        for (Gericht pizza : this.pizzas) {
            builder.append("\t").append(pizza.toString()).append("\n");
        }
        builder.append("Pastas").append("\n");
        for (Gericht pasta : this.pastas) {
            builder.append("\t").append(pasta.toString()).append("\n");
        }
        builder.append("Desserts").append("\n");
        for (Gericht dessert : this.desserts) {
            builder.append("\t").append(dessert.toString()).append("\n");
        }
        return builder.toString();
    }

    public void addGericht(Gericht gericht) {
        // TODO Richtige Liste durch Klasse auswählen
        String klasse = gericht.getClass().getSimpleName();
        if (klasse.equals("Pizza")) {
            this.pizzas.add(gericht);

        }
        if (klasse.equals("Pasta")) {
            this.pastas.add(gericht);
        }
        if (klasse.equals("Dessert")) {
            this.desserts.add(gericht);
        }
    }
    public void addSpeise(Speise Margarita) {
    }

    public Speise[] getSpeisen() {
        return new Speise[0];
    }
}
