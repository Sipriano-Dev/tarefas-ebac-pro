package exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void deveRetornarZeroParaNZero() {
        long resultado = Fibonacci.encontrarElementoPD(0);
        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarUmParaNUm() {
        long resultado = Fibonacci.encontrarElementoPD(1);
        assertEquals(1, resultado);
    }

    @Test
    void deveCalcularFibonacciParaNPequeno() {
        long resultado = Fibonacci.encontrarElementoPD(10);
        assertEquals(55, resultado);
    }

    @Test
    void deveCalcularFibonacciParaNMedio() {
        long resultado = Fibonacci.encontrarElementoPD(20);
        assertEquals(6765, resultado);
    }

    @Test
    void deveCalcularFibonacciParaNGrande() {
        long resultado = Fibonacci.encontrarElementoPD(50);
        assertEquals(12586269025L, resultado);
    }

    @Test
    void deveRetornarMesmoResultadoEmChamadasRepetidas() {
        long primeiro = Fibonacci.encontrarElementoPD(30);
        long segundo = Fibonacci.encontrarElementoPD(30);

        assertEquals(primeiro, segundo);
    }

}
