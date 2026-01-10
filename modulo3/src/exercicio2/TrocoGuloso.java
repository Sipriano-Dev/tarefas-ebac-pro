package exercicio2;

import java.util.LinkedHashMap;
import java.util.Map;

public class TrocoGuloso {

    public static Map<Integer, Integer> darTroco(int valor, int[] moedas) {
        Map<Integer, Integer> resultado = new LinkedHashMap<>();

        for (int moeda : moedas) {
            int quantidade = valor / moeda;

            if (quantidade > 0) {
                resultado.put(moeda, quantidade);
                valor -= quantidade * moeda;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int valor = 18;
        int[] moedas = {5, 2, 1};

        Map<Integer, Integer> troco = darTroco(valor, moedas);

        int totalMoedas = 0;
        for (Map.Entry<Integer, Integer> entry : troco.entrySet()) {
            System.out.println(entry.getValue() + " moeda(s) de " + entry.getKey());
            totalMoedas += entry.getValue();
        }

        System.out.println("Total de moedas: " + totalMoedas);
    }
}