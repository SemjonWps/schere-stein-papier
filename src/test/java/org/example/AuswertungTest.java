package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;

class AuswertungTest {
    @Test
    void ichHabeDasGleichenWertWieMeinGegner_ErgebnisIstUnentschieden() {
        assertThat(Auswertung.rundeAuswerten(Symbol.SCHERE, Symbol.SCHERE))
                .isEqualTo(new Rundenergebnis(Ergebnis.UNENTSCHIEDEN, Ergebnis.UNENTSCHIEDEN));
        assertThat(Auswertung.rundeAuswerten(Symbol.STEIN, Symbol.STEIN))
                .isEqualTo(new Rundenergebnis(Ergebnis.UNENTSCHIEDEN, Ergebnis.UNENTSCHIEDEN));
        assertThat(Auswertung.rundeAuswerten(Symbol.PAPIER, Symbol.PAPIER))
                .isEqualTo(new Rundenergebnis(Ergebnis.UNENTSCHIEDEN, Ergebnis.UNENTSCHIEDEN));
        assertThat(Auswertung.rundeAuswerten(Symbol.BRUNNEN, Symbol.BRUNNEN))
                .isEqualTo(new Rundenergebnis(Ergebnis.UNENTSCHIEDEN, Ergebnis.UNENTSCHIEDEN));
    }

    @Test
    void ichHabeSchereUndGegnerHatPapier_ErgebnisIstSieg() {
        assertThat(Auswertung.rundeAuswerten(Symbol.SCHERE, Symbol.PAPIER))
                .isEqualTo(new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE));
    }

    @Test
    void ichHabeSchereUndGegnerHatStein_ErgebnisIstNiederlage() {
        assertThat(Auswertung.rundeAuswerten(Symbol.SCHERE, Symbol.STEIN))
                .isEqualTo(new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG));
    }

    @Test
    void ichHabeSchereUndGegnerHatBrunnen_ErgebnisIstNiederlage() {
        assertThat(Auswertung.rundeAuswerten(Symbol.SCHERE, Symbol.BRUNNEN))
                .isEqualTo(new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG));
    }

    @Test
    void ichHabeSteinUndGegnerHatSchere_ErgebnisIstSieg() {
        assertThat(Auswertung.rundeAuswerten(Symbol.STEIN, Symbol.SCHERE))
                .isEqualTo(new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE));
    }

    @Test
    void ichHabeSteinUndGegnerHatPapier_ErgebnisIstNiederlage() {
        assertThat(Auswertung.rundeAuswerten(Symbol.STEIN, Symbol.PAPIER))
                .isEqualTo(new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG));
    }

    @Test
    void ichHabeSteinUndGegnerHatBrunnen_ErgebnisIstNiederlage() {
        assertThat(Auswertung.rundeAuswerten(Symbol.STEIN, Symbol.BRUNNEN))
                .isEqualTo(new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG));
    }

    @Test
    void ichHabePapierUndGegnerHatStein_ErgebnisIstSieg() {
        assertThat(Auswertung.rundeAuswerten(Symbol.PAPIER, Symbol.STEIN))
                .isEqualTo(new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE));
    }

    @Test
    void ichHabePapierUndGegnerHatSchere_ErgebnisIstNiederlage() {
        assertThat(Auswertung.rundeAuswerten(Symbol.PAPIER, Symbol.SCHERE))
                .isEqualTo(new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG));
    }

    @Test
    void ichHabePapierUndGegnerHatBrunnen_ErgebnisIstSieg() {
        assertThat(Auswertung.rundeAuswerten(Symbol.PAPIER, Symbol.BRUNNEN))
                .isEqualTo(new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE));
    }

    @Test
    void ichHabeBrunnenUndGegnerHatSchere_ErgebnisIstSieg() {
        assertThat(Auswertung.rundeAuswerten(Symbol.BRUNNEN, Symbol.SCHERE))
                .isEqualTo(new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE));
    }

    @Test
    void ichHabeBrunnenUndGegnerHatStein_ErgebnisIstSieg() {
        assertThat(Auswertung.rundeAuswerten(Symbol.BRUNNEN, Symbol.STEIN))
                .isEqualTo(new Rundenergebnis(Ergebnis.SIEG, Ergebnis.NIEDERLAGE));
    }

    @Test
    void ichHabeBrunnenUndGegnerHatPapier_ErgebnisIstNiederlage() {
        assertThat(Auswertung.rundeAuswerten(Symbol.BRUNNEN, Symbol.PAPIER))
                .isEqualTo(new Rundenergebnis(Ergebnis.NIEDERLAGE, Ergebnis.SIEG));
    }
}