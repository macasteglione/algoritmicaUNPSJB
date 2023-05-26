package test;

import net.datastructures.Entry;
import net.datastructures.TreeMap;
import universidad.Alumno;

public class Prueba {

	public static void main(String[] args) {

		Alumno a1 = new Alumno(1000, "Juan");
		Alumno a2 = new Alumno(20, "Ana");
		Alumno a3 = new Alumno(300, "Pablo");

		TreeMap<Integer, Alumno> alumnos = new TreeMap<>();

		alumnos.put(a1.getLegajo(), a1);
		alumnos.put(a2.getLegajo(), a2);
		alumnos.put(a3.getLegajo(), a3);

		for (Entry<Integer, Alumno> pos : alumnos.entrySet())
			System.out.println(pos);
		
	}
}
