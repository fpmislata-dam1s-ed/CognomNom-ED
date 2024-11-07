package ud4.examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebugRockPaperScissorsTest {

    @Nested
    class Empat {

        @Test
        @DisplayName("Empat: Pedra vs Pedra")
        void testEmpatPedraPedra() {
            int expected = 0;
            int actual = DebugRockPaperScissors.guanya("Pedra", "Pedra");

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Empat: Paper vs Paper")
        void testEmpatPaperPaper() {
            int expected = 0;
            int actual = DebugRockPaperScissors.guanya("Paper", "Paper");

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Empat: Tisora vs Tisora")
        void testEmpatTisoraTisora() {
            int expected = 0;
            int actual = DebugRockPaperScissors.guanya("Tisora", "Tisora");

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Jugador1 {

        @Test
        @DisplayName("Jugador 1 guanya: Pedra vs Tisora")
        void testJugador1GuanyaPedraTisora() {
            int expected = 1;
            int actual = DebugRockPaperScissors.guanya("Pedra", "Tisora");

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Jugador 1 guanya: Paper vs Pedra")
        void testJugador1GuanyaPaperPedra() {
            int expected = 1;
            int actual = DebugRockPaperScissors.guanya("Paper", "Pedra");

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Jugador 1 guanya: Tisora vs Paper")
        void testJugador1GuanyaTisoraPaper() {
            int expected = 1;
            int actual = DebugRockPaperScissors.guanya("Tisora", "Paper");

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Jugador2 {

        @Test
        @DisplayName("Jugador 2 guanya: Tisora vs Pedra")
        void testJugador2GuanyaTisoraPedra() {
            int expected = 2;
            int actual = DebugRockPaperScissors.guanya("Tisora", "Pedra");

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Jugador 2 guanya: Pedra vs Paper")
        void testJugador2GuanyaPedraPaper() {
            int expected = 2;
            int actual = DebugRockPaperScissors.guanya("Pedra", "Paper");

            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Jugador 2 guanya: Paper vs Tisora")
        void testJugador2GuanyaPaperTisora() {
            int expected = 2;
            int actual = DebugRockPaperScissors.guanya("Paper", "Tisora");

            assertEquals(expected, actual);
        }
    }
}
