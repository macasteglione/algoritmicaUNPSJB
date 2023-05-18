import logica.*;

public class PruebaStack {

    public static void calcularTiempo(Stack<Integer> stack) {

        int size = 1000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++)
            stack.push(i);
        while (!stack.isEmpty())
            stack.pop();
        long end = System.currentTimeMillis();
        System.out.println(stack.getClass().getName() + ": " + (end - start) + "ms");
    }

    public static void main(String[] args) {
        Stack<Integer> doublyLinkedStack = new DoublyLinkedStack<Integer>();
        Stack<Integer> arrayStack = new ArrayStack<Integer>();
        Stack<Integer> linkedStack = new LinkedListStack<Integer>();

        calcularTiempo(arrayStack);
        calcularTiempo(linkedStack);
        calcularTiempo(doublyLinkedStack);
    }
}