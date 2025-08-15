package org.example;

public class Auswertung {

    static Rundenergebnis rundeAuswerten(Symbol spieler1, Symbol spieler2) {
        final var ergebnisSpieler1 = spieler1.berechneErgebnis(spieler2);

        final var siegSymbol = switch (ergebnisSpieler1) {
            case SIEG -> spieler1;
            case NIEDERLAGE -> spieler2;
            case UNENTSCHIEDEN -> null;
        };

        return new Rundenergebnis(ergebnisSpieler1, ergebnisSpieler1.invertiere(), siegSymbol);
    }
}
