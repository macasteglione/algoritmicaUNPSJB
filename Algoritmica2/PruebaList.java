public class PruebaList {
    public static void main(String[] args) {
        DoublyLinkedList<String> lista = new DoublyLinkedList<String>();

        lista.addFirst("hola");
        lista.addFirst("chau");
        lista.addFirst("no");
        lista.addLast("fff");
        lista.addLast("maty");

        System.out.println(lista);

        //lista.removeRange(0, 3);
        //SinglyLinkedList<String> nuevaLista = lista.subList(0, 2);
        
        //lista.removeRange(0, 3);
        DoublyLinkedList<String> nuevaLista = lista.rightList(2);
        System.out.println(nuevaLista);
    }
}
