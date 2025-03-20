package org.example;

public class Auswertung {

    static Rundenergebnis rundeAuswerten(Symbol spieler1, Symbol spieler2) {
        if (spieler1 == spieler2) {
            return new Rundenergebnis(Ergebnis.UNENTSCHIEDEN, Ergebnis.UNENTSCHIEDEN);
        } else if (spieler1 == Symbol.SCHERE && spieler2 == Symbol.PAPIER) {
            return new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE);
        } else if (spieler1 == Symbol.SCHERE && spieler2 == Symbol.STEIN) {
            return new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG);
        } else if (spieler1 == Symbol.STEIN && spieler2 == Symbol.SCHERE) {
            return new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE);
        } else if (spieler1 == Symbol.STEIN && spieler2 == Symbol.PAPIER) {
            return new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG);
        } else if (spieler1 == Symbol.PAPIER && spieler2 == Symbol.STEIN) {
            return new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE);
        } else if (spieler1 == Symbol.PAPIER && spieler2 == Symbol.SCHERE) {
            return new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG);
        }
        throw new IllegalStateException("es wurde ein unerwartetes Symbol uebergeben");
    }
}
