package desafio.hashmap;

import java.util.Arrays;

public class SimpleHashMap {

    private static final int SIZE = 10;

    private static final int EMPTY = 0;
    private static final int OCCUPIED = 1;
    private static final int DELETED = 2;

    private int[] keys = new int[SIZE];
    private int[] values = new int[SIZE];
    private int[] state = new int[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);

        for (int i = 0; i < SIZE; i++) {
            int pos = (index + i) % SIZE;

            if (state[pos] == EMPTY || state[pos] == DELETED) {
                keys[pos] = key;
                values[pos] = value;
                state[pos] = OCCUPIED;
                return;
            }

            if (state[pos] == OCCUPIED && keys[pos] == key) {
                values[pos] = value; // update
                return;
            }
        }

        throw new RuntimeException("Mapa cheio");
    }

    public int get(int key) {
        int index = hash(key);

        for (int i = 0; i < SIZE; i++) {
            int pos = (index + i) % SIZE;

            if (state[pos] == EMPTY) {
                // nunca foi usado, então a chave não existe
                throw new RuntimeException("Chave não encontrada");
            }

            if (state[pos] == OCCUPIED && keys[pos] == key) {
                return values[pos];
            }

            // se for DELETED ou OCCUPIED com outra chave,
            // continua procurando
        }

        throw new RuntimeException("Chave não encontrada");
    }

    public void delete(int key) {
        int index = hash(key);

        for (int i = 0; i < SIZE; i++) {
            int pos = (index + i) % SIZE;

            if (state[pos] == EMPTY) {
                // nunca foi usado → chave não existe
                return;
            }

            if (state[pos] == OCCUPIED && keys[pos] == key) {
                state[pos] = DELETED;
                return;
            }

            // se for DELETED ou OCCUPIED com outra chave,
            // continua procurando
        }
    }

    public void clear() {
        Arrays.fill(state, EMPTY);
    }

}