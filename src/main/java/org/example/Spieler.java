package org.example;

import java.util.function.*;

public class Spieler {
    private final String name;
    private final Supplier<Symbol> strategie;

    private int gewonnen = 0;
    private int verloren = 0;
    private int unentschieden = 0;

    public Spieler(String name, Supplier<Symbol> strategie) {
        this.name = name;
        this.strategie = strategie;
    }

    public Symbol wertAusdenken() {
        return strategie.get();
    }

    public void ergebnisMelden(Ergebnis ergebnis) {
        switch (ergebnis) {
            case SIEG -> gewonnen++;
            case NIEDERLAGE -> verloren++;
            case UNENTSCHIEDEN -> unentschieden++;
        }
    }

    public String createSummary() {
        return "Spieler " + name + " hat:\n" +
                String.format("%02d", gewonnen) + " mal gewonnen\n" +
                String.format("%02d", verloren) + " mal verloren\n" +
                String.format("%02d", unentschieden) + " mal unentschieden";
    }

}
