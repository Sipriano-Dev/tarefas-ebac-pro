package exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveSomarDoisNumeros() {
        int resultado = calculadora.adicionar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void deveSubtrairDoisNumeros() {
        int resultado = calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        int resultado = calculadora.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    void deveDividirDoisNumeros() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }
}
