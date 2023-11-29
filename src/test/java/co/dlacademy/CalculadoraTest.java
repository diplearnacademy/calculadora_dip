package co.dlacademy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 y 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(4, 3), "La resta de 4 y 3 debe ser 1");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3), "La multiplicación de 2 y 3 debe ser 6");
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3), "La división de 6 y 3 debe ser 2");
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(1, 0), "La división por cero debe lanzar una IllegalArgumentException");
    }
}
