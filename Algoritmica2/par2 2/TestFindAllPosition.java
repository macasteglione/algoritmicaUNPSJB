import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import net.datastructures.*;

public class TestFindAllPosition {

    private PositionalList<String> pl = new LinkedPositionalList<>();
    private Position<String> pos1;
    private Position<String> pos2;
    private Position<String> pos3;

    @Before
    public void setUp() throws Exception {
        pos1 = pl.addFirst("Ana");
        pos2 = pl.addAfter(pos1, "Juan");
        pos3 = pl.addAfter(pos2, "Ana");
    }

    @Test
    public void testPosicionValida1() {
        PositionalList<Position<String>> f = pl.findAllPosition("Ana");
        assertEquals(f.size(), 2);
        for (Position<String> p : f)
            assertEquals(p.getElement(), "Ana");
    }

    @Test
    public void testPosicionValida2() {
        PositionalList<Position<String>> f = pl.findAllPosition("Juan");
        assertEquals(f.size(), 1);
        assertEquals(f.first().getElement(), pos2);
    }

    @Test
    public void testPosicionNoValida1() {
        PositionalList<Position<String>> f = pl.findAllPosition("Pedro");
        assertEquals(f.size(), 0);
    }
}