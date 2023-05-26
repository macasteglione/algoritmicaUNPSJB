package logica.datastructures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFindPosition {

	private PositionalList<Alumno> pl = new LinkedPositionalList<Alumno>();
	private Position<Alumno> pos1;
	private Position<Alumno> pos2;

	@Before
	public void setUp() throws Exception {
		pos1 = pl.addFirst(new Alumno(10, "Juan"));
		pos2 = pl.addAfter(pos1, new Alumno(20, "Ana"));
	}

	@Test
	public void testPosicionValida1() {
		assertEquals(pl.findPosition(new Alumno(10, null)), pos1);
	}

	@Test
	public void testPosicionValida2() {
		assertEquals(pl.findPosition(new Alumno(20, null)), pos2);
	}

	@Test
	public void testPosicionNoValida1() {
		pl.remove(pos2);
		assertEquals(pl.findPosition(new Alumno(20, null)), null);
	}

	@Test
	public void testPosicionNoValida2() {
		assertEquals(pl.findPosition(null), null);		
	}

	@Test
	public void testListaVacia() {
		pl.remove(pos1);
		pl.remove(pos2);
		assertEquals(pl.findPosition(null), null);		
	}

}
