package exercicio3.lista;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("=== addFirst ===");
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(1);
        list.printList();

        System.out.println("\n=== addLast ===");
        list.addLast(20);
        list.addLast(30);
        list.printList();

        System.out.println("\n=== elementAt ===");
        System.out.println("Index 0: " + list.elementAt(0));
        System.out.println("Index 2: " + list.elementAt(2));
        System.out.println("Index 4: " + list.elementAt(4));

        System.out.println("\n=== insert(index, value) ===");
        list.insert(2, 99);
        list.printList();

        System.out.println("\n=== removeFirst ===");
        list.removeFirst();
        list.printList();

        System.out.println("\n=== removeLast ===");
        list.removeLast();
        list.printList();

        System.out.println("\n=== remove(index) ===");
        list.remove(2);
        list.printList();

        System.out.println("\n=== removendo tudo ===");
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst(); // lista vazia
        list.printList();
    }

}