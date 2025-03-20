package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.*;

class SpielerTest {
    @Test
    void createSummary_ShouldReturnCorrectSummary() {
        // Arrange
        Spieler spieler = new Spieler("Max", () -> Symbol.SCHERE);

        spieler.ergebnisMelden(Ergebnis.SIEG);
        spieler.ergebnisMelden(Ergebnis.SIEG);
        spieler.ergebnisMelden(Ergebnis.SIEG);
        spieler.ergebnisMelden(Ergebnis.NIEDERLAGE);
        spieler.ergebnisMelden(Ergebnis.NIEDERLAGE);
        spieler.ergebnisMelden(Ergebnis.UNENTSCHIEDEN);
        spieler.ergebnisMelden(Ergebnis.UNENTSCHIEDEN);
        spieler.ergebnisMelden(Ergebnis.UNENTSCHIEDEN);
        spieler.ergebnisMelden(Ergebnis.UNENTSCHIEDEN);

        String expectedSummary = """
                Spieler Max hat:
                03 mal gewonnen
                02 mal verloren
                04 mal unentschieden""";

        // Act & Assert
        assertThat(spieler.createSummary()).isEqualTo(expectedSummary);
    }

    @Test
    void createSummary_ShouldHandleZeroResults() {
        // Arrange
        Spieler spieler = new Spieler("Anna", () -> Symbol.PAPIER);

        String expectedSummary = """
                Spieler Anna hat:
                00 mal gewonnen
                00 mal verloren
                00 mal unentschieden""";

        // Act & Assert
        assertThat(spieler.createSummary()).isEqualTo(expectedSummary);
    }
}