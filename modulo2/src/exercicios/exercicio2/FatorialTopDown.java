package exercicios.exercicio2;

import java.math.BigInteger;
import java.util.Arrays;

public class FatorialTopDown {

    private static BigInteger[] memo;

    public static void main(String[] args) {
        int n = 100;
        memo = new BigInteger[n + 1];
        Arrays.fill(memo, null);

        System.out.println(fatorial(n));
    }

    public static BigInteger fatorial(int n) {
        if (n < 1) {
            return BigInteger.ONE;
        }

        // 🔹 PROGRAMACAO DINAMICA (TOP-DOWN)
        if (memo[n] != null) {
            return memo[n];
        }

        memo[n] = BigInteger.valueOf(n).multiply(fatorial(n - 1));
        return memo[n];
    }
}