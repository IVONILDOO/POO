package ListaAgendaDeAniversariantes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEqualss {

	@Test
	public void test() {
		DataAniversario d1 = new DataAniversario(22,03,1992);
		DataAniversario d2 = new DataAniversario(22,03,1992);
		DataAniversario d3 = new DataAniversario(23,06,1996);
		
		assertTrue(d1.equals(d2));
		assertFalse(d1.equals(d3));
		assertEquals(d1,d2);
		assertNotEquals(d1,d3);
	}
	


}
