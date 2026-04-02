import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Clase a probar
    static class Calculadora {
        public int sumar(int a, int b) {
            return a + b;
        }

        public int restar(int a, int b) {
            return a - b;
        }
    }

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(0, calc.sumar(2, -2));
        assertEquals(-5, calc.sumar(-2, -3));
    }

    @Test
    void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
        assertEquals(4, calc.restar(2, -2));
        assertEquals(1, calc.restar(-2, -3));
    }
}
