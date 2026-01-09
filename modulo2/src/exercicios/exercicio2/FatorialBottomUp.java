package exercicios.exercicio2;

import java.math.BigInteger;

public class FatorialBottomUp {

    public static void main(String[] args) {
        int n = 100;
        System.out.println(fatorial(n));
    }

    public static BigInteger fatorial(int n) {

        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1].multiply(BigInteger.valueOf(i));
        }

        return dp[n];
    }
}