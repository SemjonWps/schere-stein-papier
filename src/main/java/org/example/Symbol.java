package org.example;

import java.util.*;

public enum Symbol {
    SCHERE(Set.of("PAPIER"), Set.of("STEIN", "BRUNNEN")),
    STEIN(Set.of("SCHERE"), Set.of("PAPIER", "BRUNNEN")),
    PAPIER(Set.of("STEIN", "BRUNNEN"), Set.of("SCHERE")),
    BRUNNEN(Set.of("STEIN", "SCHERE"), Set.of("PAPIER"));

    private final Set<String> gewinnt;
    private final Set<String> niederlage;

    private Symbol(Set<String> gewinnt, Set<String> niederlage) {
        this.gewinnt = gewinnt;
        this.niederlage = niederlage;
    }

    public Ergebnis berechneErgebnis(Symbol gegner) {
        if (this == gegner) {
            return Ergebnis.UNENTSCHIEDEN;
        }
        else if (gewinnt.contains(gegner.name())) {
            return Ergebnis.SIEG;
        }
        else if (niederlage.contains(gegner.name())) {
            return Ergebnis.NIEDERLAGE;
        }

        throw new RuntimeException("invalid Symbol");
    }
}
