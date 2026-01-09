package exercicios.exercicio1;

public class Fatorial {

    public static void main(String[] args) {

        long n = 60;
        System.out.println(fatorial(n));

    }

    public static long fatorial(long n) {
        if (n <= 0) {
            return 1;
        }
        return n * fatorial(n -1);
    }

}
