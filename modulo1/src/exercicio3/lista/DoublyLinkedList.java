package exercicio3.lista;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    private static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);

        // Caso 1: lista vazia
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Caso 2: lista não vazia
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Equivalente ao push
    //Tempo O(1)
    //Espaço O(1)
    public void addLast(int value) {
        Node newNode = new Node(value);

        // Caso 1: lista vazia
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Caso 2: lista não vazia
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeFirst() {

        // Caso 1: lista vazia
        if (head == null) {
            return;
        }

        // Caso 2: apenas um elemento
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        // Caso 3: mais de um elemento
        head = head.next;
        head.prev = null;
    }

    //Equivalente a pop
    //Tempo O(1)
    //Espaço O(1)
    public void removeLast() {

        // Caso 1: lista vazia
        if (tail == null) {
            return;
        }

        // Caso 2: apenas um elemento
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        // Caso 3: mais de um elemento
        tail = tail.prev;
        tail.next = null;
    }

    //Tempo O(n)
    //Espaço O(1)
    public int elementAt(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.value;
            }
            current = current.next;
            currentIndex++;
        }

        throw new IndexOutOfBoundsException();
    }

    //Tempo O(n)
    //Espaço O(1)
    public void insert(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(value);

        newNode.prev = current.prev;
        newNode.next = current;

        current.prev.next = newNode;
        current.prev = newNode;
    }

    //Tempo O(n)
    //Espaço O(1)
    public void remove(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        if (current == tail) {
            removeLast();
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


}