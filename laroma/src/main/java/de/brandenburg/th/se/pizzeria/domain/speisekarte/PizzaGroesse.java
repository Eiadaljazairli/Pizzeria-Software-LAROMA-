package de.brandenburg.th.se.pizzeria.domain.speisekarte;

public class PizzaGroesse extends Groesse {
    public PizzaGroesse(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Pizza Größe: " + super.toString();
    }
}
