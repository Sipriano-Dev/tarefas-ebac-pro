package exercicios.exercicio1;

public class Fatorial {

    public static void main(String[] args) {

        long n = 100;
        System.out.println(fatorial(n));

    }

    public static long fatorial(long n) {
        if (n < 1) {
            return 1;
        }
        return n * fatorial(n -1);
    }

}
