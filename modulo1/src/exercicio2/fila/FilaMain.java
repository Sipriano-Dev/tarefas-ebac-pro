package exercicio2.fila;

public class FilaMain {

    public static void main(String[] args) {

        Fila fila = new Fila();

        System.out.println("Camada 1");
        System.out.println("isEmpty() deve retorna true: " + fila.isEmpty());
        System.out.println("size() deve retorna 0: " + fila.size());
        fila.enqueue(11);
        fila.enqueue(12);
        fila.enqueue(13);
        fila.enqueue(14);
        System.out.println("Camada 2");
        System.out.println("isEmpty deve retorna false: " + fila.isEmpty());
        System.out.println("front() deve retorna 11: " + fila.front());
        System.out.println("rear() deve retorna 14: " + fila.rear());
        System.out.println("size() deve retorna 4: " + fila.size());
        fila.enqueue(15);
        fila.enqueue(16);
        System.out.println("Camada 3");
        System.out.println("front() deve retorna 11: " + fila.front());
        System.out.println("rear() deve retorna 16: " + fila.rear());
        System.out.println("size() deve retorna 6: " + fila.size());
        fila.dequeue();
        fila.dequeue();
        System.out.println("Camada 4");
        System.out.println("front() deve retorna 13: " + fila.front());
        System.out.println("rear() deve retorna 16: " + fila.rear());
        System.out.println("size() deve retorna 4: " + fila.size());
        fila.enqueue(17);
        fila.enqueue(18);
        System.out.println("Camada 5");
        System.out.println("front() deve retorna 13: " + fila.front());
        System.out.println("rear() deve retorna 18: " + fila.rear());
        System.out.println("size() deve retorna 6: " + fila.size());

        System.out.println("Camada 6");
        System.out.println("isEmpty deve retorna false: " + fila.isEmpty());
        System.out.println("front() deve retorna 13: " + fila.front());
        System.out.println("rear() deve retorna 18: " + fila.rear());
        System.out.println("size() deve retorna 6: " + fila.size());



        System.out.println();

    }

}
