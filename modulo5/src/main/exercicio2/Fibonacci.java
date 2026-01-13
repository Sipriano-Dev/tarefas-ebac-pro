package exercicio2;

import java.util.Arrays;

/**
 Crie um metodo chamado encontrarElemento que seja capaz de encontrar o enésimo elemento de uma sequência de Fibonacci.
 Entrada: n, um inteiro representando a posição do elemento na sequência.
 Saida: o enésimo elemento da sequência de Fibonacci.
 Sequência: h 13 21 34 55 89
 */


public class Fibonacci {

    private static final int MAX_ELEMENTS = 100;
    private static final long[] elementosFib = new long[MAX_ELEMENTS];

    public static void main(String[] args) {
        int n = 50;

        System.out.println("Elemento " + n + ": " + encontrarElementoPD(n));

    }

    public static long encontrarElemento(int n) {
        if(elementosFib[n] == -1) {
            if (n <= 1) {
                elementosFib[n] = n;
            } else {
                elementosFib[n] = encontrarElemento(n -1) + encontrarElemento(n - 2);
            }

        }

        return elementosFib[n];

    }

    public static long encontrarElementoPD(int n) {
        Arrays.fill(elementosFib, -1);
        return encontrarElemento(n);
    }

}