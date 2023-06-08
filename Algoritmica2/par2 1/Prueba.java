package test;

import net.datastructures.ArrayList;
import net.datastructures.List;

public class Prueba<E> {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add(0, "A");
		l.add(0, "B");
		l.add(0, "C");
		l.add(0, "D");
		
		List<String> c = new ArrayList<String>();
		c.add(0, "A");
	
		if (l.containsAll(c))
			System.out.println("La lista est� contenida");
		else
			System.out.println("La lista no est� contenida");
	
		c.add(0, "F");
		
		if (l.containsAll(c))
			System.out.println("La lista est� contenida");
		else
			System.out.println("La lista no est� contenida");
		
	}
}

