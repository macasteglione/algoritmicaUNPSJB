package logica.datastructures;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestIndexOf {

	private PositionalList<String> pl = new LinkedPositionalList<String>();
	private Position<String> pos1;
	private Position<String> pos2;

	@Before
	public void setUp() throws Exception {

		pos1 = pl.addFirst("Hola");
		pos2 = pl.addAfter(pos1, "Mundo");
	}

	@Test
	public void testPosicionValida1() {
		System.out.println(pl.indexOf(pos1));

		assertEquals(pl.indexOf(pos1), 0);
	}

	@Test
	public void testPosicionValida2() {
		assertEquals(pl.indexOf(pos2), 1);
	}

	@Test
	public void testPosicionNoValida1() {
		pl.remove(pos2);
		assertEquals(pl.indexOf(pos2), -1);
	}

	@Test
	public void testPosicionNoValida2() {
		assertEquals(pl.indexOf(null), -1);
	}

	@Test
	public void testListaVacia() {
		pl.remove(pos1);
		pl.remove(pos2);
		assertEquals(pl.indexOf(null), -1);
	}

}
