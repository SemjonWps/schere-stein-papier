package org.example;

public enum Ergebnis {
    UNENTSCHIEDEN,
    SIEG,
    NIEDERLAGE;

    public Ergebnis invertiere() {
        if(this == UNENTSCHIEDEN) {
            return UNENTSCHIEDEN;
        }
        else if(this == NIEDERLAGE) {
            return SIEG;
        }
        else {
            return NIEDERLAGE;
        }
    }
}
