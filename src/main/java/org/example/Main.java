package org.example;

import java.util.*;

public class Main {
    private static final int ANZAHL_RUNDEN = 100;

    private static final Symbol[] SYMBOLE = Symbol.values();
    private static final int SIZE = SYMBOLE.length;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        final var spielerA = new Spieler("A", () -> Symbol.PAPIER);
        final var spielerB = new Spieler("B", () -> SYMBOLE[RANDOM.nextInt(SIZE)]);

        for (int i = 0; i < ANZAHL_RUNDEN; i++) {
            final var ergebnis = Auswertung.rundeAuswerten(
                    spielerA.wertAusdenken(), spielerB.wertAusdenken());
            spielerA.ergebnisMelden(ergebnis.spieler1());
            spielerB.ergebnisMelden(ergebnis.spieler2());
        }

        System.out.println(spielerA.createSummary() + "\n");
        System.out.println(spielerB.createSummary());
    }
}
