package exercicio2.fila;

public class Fila {

    private int[] data;
    private int size;
    private int front;
    private int rear;

    public Fila() {
        this.data = new int[4];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    //Inserir no final da fila
    //Tempo O(1) Amortizado
    //Espaço O(1)
    public void enqueue(int valor) {
        if (size == data.length) {
            resize();
        }

        data[rear] = valor;
        size++;
        rear++;

    }

    //Remover o primeiro da fila
    //Tempo O(1)
    //Espaço O(1)
    public void dequeue() {
        if (size == 0) {
            throw new RuntimeException("Fila Vazia!");
        }
        front++;
        size--;
    }

    //Retorna o ultimo da fila, ultimo a entrar
    //Tempo O(1)
    //Espaço O(1)
    public int rear() {
        if (size == 0) {
            throw new RuntimeException("Lista vazia");
        }
        return data[rear-1];
    }

    //Retorna o inteiro q ta na frente da fila, primeiro q entrou
    //Tempo O(1)
    //Espaço O(1)
    public int front() {
        if (size == 0 ) {
            throw new RuntimeException("Lista vazia");
        }
        return data[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public int get(int index) {
        return data[index];
    }


}
