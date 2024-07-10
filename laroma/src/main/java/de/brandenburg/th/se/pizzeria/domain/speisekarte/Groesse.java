package de.brandenburg.th.se.pizzeria.domain.speisekarte;

public class Groesse {
    private String name;

    public Groesse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Größe: " + name;
    }
}
