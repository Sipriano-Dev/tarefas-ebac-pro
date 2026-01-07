package exercicio1.pilha;

public class PilhaMain {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        System.out.println("isEmpty() deve ser true: " + pilha.isEmpty());
        System.out.println("size() deve ser 0: " + pilha.size());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println("isEmpty() deve ser false: " + pilha.isEmpty());
        System.out.println("size() deve ser 4: " + pilha.size());
        System.out.println("top() deve ser 4: " + pilha.top());
        System.out.println("pop() deve ser 4: " + pilha.pop());
        System.out.println("top() deve ser 3: " + pilha.top());

        pilha.push(5);
        pilha.push(6);
        pilha.push(7);

        System.out.println("isEmpty() deve ser false: " + pilha.isEmpty());
        System.out.println("size() deve ser 6: " + pilha.size());
        System.out.println("top() deve ser 7: " + pilha.top());
        System.out.println("pop() deve ser 7: " + pilha.pop());
        System.out.println("top() deve ser 6: " + pilha.top());







    }


}
