import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList<E> {
	// ---------------- nested Node class ----------------
	private static class Node<E> {
		private E element; // reference to the element stored at this node
		private Node<E> next; // reference to the subsequent node in the list

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	// ----------- end of nested Node class -----------
	// instance variables of the SinglyLinkedList
	private Node<E> head = null; // head node of the list (or null if empty)
	private Node<E> tail = null; // last node of the list (or null if empty)
	private Node<E> tmp = null;
	private int size = 0; // number of nodes in the list

	public SinglyLinkedList() {
	} // constructs an initially empty list

	// access methods
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() { // returns (but does not remove) the first element
		if (isEmpty())
			return null;
		return head.getElement();
	}

	public E last() { // returns (but does not remove) the last element
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void addFirst(E e) { // adds element e to the front of the list
		head = new Node<>(e, head); // create and link a new node
		if (size == 0)
			tail = head; // special case: new node becomes tail also
		size++;
	}

	public void addLast(E e) { // adds element e to the end of the list
		Node<E> newest = new Node<>(e, null); // node will eventually be the
												// tail
		if (isEmpty())
			head = newest; // special case: previously empty list
		else
			tail.setNext(newest); // new node after existing tail
		tail = newest; // new node becomes the tail
		size++;
	}

	public E removeFirst() { // removes and returns the first element
		if (isEmpty())
			return null; // nothing to remove
		E answer = head.getElement();
		head = head.getNext();
		// will become null if list had only one node
		size--;
		if (size == 0)
			tail = null; // special case as list is now empty
		return answer;
	}

	public String toString() { // print the list
		String out = "";

		if (isEmpty())
			out = "List is empty"; // special case: previously empty list
		else
			tmp = head;
		for (int i = 0; i < size; i++) {
			out += "->" + tmp.getElement();
			// System.out.println(out);
			tmp = tmp.next;
		}
		return out;
	}

	// Retorna el índice de la última ocurrencia de un elemento especificado
	// en la lista o -1 si la lista no contiene el elemento
	public int lastIndexOf(E e) {
		int index = -1;
		if (isEmpty())
			return index;
		int currentIndex = 0;
		Node<E> current = head;
		while (current != null) {
			if (current.getElement().equals(e))
				index = currentIndex;
			current = current.next;
			currentIndex++;
		}
		return index;
	}

	// Retorna true si la lista contiene un elemento duplicado
	public boolean containsDuplicate() {
		Set<E> set = new HashSet<>();
		Node<E> current = head;
		while (current != null) {
			if (set.contains(current.element))
				return true;
			set.add(current.element);
			current = current.next;
		}
		return false;
	}

	/*
	 * Retorna una nueva lista con todos los elementos de fromIndex a toIndex
	 * inclusive
	 */
	/*
	 * Si fromIndex <0 o toIndex >= al tamaño de la lista, lanza la excepcion:
	 * IndexOutOfBoundsException
	 */
	/* Si fromIndex > toIndex, lanza la excepción: IllegalArgumentException */
	public SinglyLinkedList<E> subList(int fromIndex, int toIndex) {
		if (fromIndex < 0 || toIndex >= size)
			throw new IndexOutOfBoundsException("Fuera de rango");
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("Error en los parametros");
		int i = 0;
		Node<E> current = head;
		SinglyLinkedList<E> nuevaLista = new SinglyLinkedList<E>();
		while (i < fromIndex) {
			current = current.next;
			i++;
		}
		while (i <= toIndex) {
			nuevaLista.addLast(current.getElement());
			current = current.next;
			i++;
		}
		return nuevaLista;
	}

	/* Elimina todos los elementos de fromIndex a toIndex inclusive */
	/*
	 * Si fromIndex <0 o toIndex >= al tamaño de la lista, lanza la excepcion:
	 * IndexOutOfBoundsException
	 */
	/* Si fromIndex > toIndex, lanza la excepción: IllegalArgumentException */
	public void removeRange(int fromIndex, int toIndex) {
		if (fromIndex < 0 || toIndex >= size)
			throw new IndexOutOfBoundsException("Fuera de rango");
		if (fromIndex > toIndex)
			throw new IllegalArgumentException("Error en los parametros");
		Node<E> current = head;
		Node<E> aux = null;
		int i = 0;
		while (i < fromIndex) {
			aux = current;
			current = current.next;
			i++;
		}
		while (i <= toIndex) {
			if (aux == null)
				head = current.next;
			else
				aux.next = current.next;
			current = current.next;
			i++;
			size--;
		}
	}

	/* Inserta el elemento e en la posicion n de la lista */
	public void addPos(E e, int n) throws IndexOutOfBoundsException {
		if (n > size || n < 0)
			throw new IndexOutOfBoundsException("Fuera de rango");
		if (n == 0)
			addFirst(e);
		else if (n == size )
			addLast(e);
		else {
			Node<E> current = head;
			Node<E> nuevo = new Node<E>(e, null);
			for (int i = 0; i < n; i++)
				current = current.next;
			nuevo.next = current.next;
			current.next = nuevo;
			size++;
		}
	}
}
