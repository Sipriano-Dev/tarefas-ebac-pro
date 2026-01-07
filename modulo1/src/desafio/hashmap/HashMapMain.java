package desafio.hashmap;

public class HashMapMain {

    public static void main(String[] args) {

        SimpleHashMap map = new SimpleHashMap();

        System.out.println("=== TESTE PUT ===");
        map.put(12, 100);
        map.put(22, 200); // colisão com 12 (mesmo hash)
        map.put(5, 50);

        System.out.println("get(12) -> esperado 100: " + map.get(12));
        System.out.println("get(22) -> esperado 200: " + map.get(22));
        System.out.println("get(5)  -> esperado 50:  " + map.get(5));

        System.out.println("\n=== TESTE UPDATE ===");
        map.put(12, 999);
        System.out.println("get(12) -> esperado 999: " + map.get(12));

        System.out.println("\n=== TESTE DELETE ===");
        map.delete(12);
        try {
            map.get(12);
            System.out.println("ERRO: deveria ter lançado exceção");
        } catch (RuntimeException e) {
            System.out.println("get(12) após delete -> OK (não encontrado)");
        }

        // ainda deve encontrar o 22, mesmo após delete do 12
        System.out.println("get(22) após delete do 12 -> esperado 200: " + map.get(22));

        System.out.println("\n=== TESTE CLEAR ===");
        map.clear();
        try {
            map.get(22);
            System.out.println("ERRO: deveria ter lançado exceção");
        } catch (RuntimeException e) {
            System.out.println("get(22) após clear -> OK (mapa vazio)");
        }

        System.out.println("\n=== TESTE PUT APÓS CLEAR ===");
        map.put(7, 70);
        System.out.println("get(7) -> esperado 70: " + map.get(7));

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}