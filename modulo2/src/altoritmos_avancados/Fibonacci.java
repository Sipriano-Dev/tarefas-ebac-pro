package altoritmos_avancados;

/**
 Crie um metodo chamado encontrarElemento que seja capaz de encontrar o enésimo elemento de uma sequência de Fibonacci.
 Entrada: n, um inteiro representando a posição do elemento na sequência.
 Saida: o enésimo elemento da sequência de Fibonacci.
 Sequência: 0 1 1 2 3 5 8 13 21 34 55 89
 */


public class Fibonacci {

    public static void main(String[] args) {

        int n = 7;
        System.out.println("Elemento " + n + ": " + encontrarElemento(n));

    }

    public static int encontrarElemento(int n) {
        if (n <= 1) {
            return n;
        }

        //2 = elemento na posição 1+ elemento na posição 0
        // 2 = encontrarElemento (1) encontrarElemento (0)
        //3 = elemento na posição 2+ elemento na posição 1
        // 3 = encontrarElemento (2) encontrarElemento (1) turn -1;
        return encontrarElemento(n -1) + encontrarElemento(n - 2);
    }

}
