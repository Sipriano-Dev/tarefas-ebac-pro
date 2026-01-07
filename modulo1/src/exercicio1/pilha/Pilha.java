package exercicio1.pilha;

public class Pilha {

    private int[] array;
    private int size;

    public Pilha() {
        this.array = new int[4];
        this.size = 0;
    }

    //Tempo O(1) Amortizado
    //Espaço O(1)
    public void push(int valor) {
        if (size == array.length){
            resize();
        }
        adicionar(valor);
    }

    //Tempo O(1)
    //Espaço O(1)
    public int pop() {
        if (size == 0) {
            throw new RuntimeException("Pilha vazia");
        }
        int result = array[size - 1];
        size--;
        return result;
    }

    public int top() {
        return array[size-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size();
    }

    private void adicionar(int valor) {
        array[size] = valor;
        size++;
    }

    private void remover() {
        size--;
    }


    private void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }


}
