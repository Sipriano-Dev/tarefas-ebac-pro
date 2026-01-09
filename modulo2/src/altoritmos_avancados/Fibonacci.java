package altoritmos_avancados;

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
                //2 = elemento na posição 1+ elemento na posição 0
                // 2 = encontrarElemento (1) encontrarElemento (0)
                //3 = elemento na posição 2+ elemento na posição 1
                // 3 = encontrarElemento (2) encontrarElemento (1) turn -1;
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
