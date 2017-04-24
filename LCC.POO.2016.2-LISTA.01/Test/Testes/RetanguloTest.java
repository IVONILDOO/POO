package Questao1;

import org.junit.Test;

public class RetanguloTest {

	@Test
	public void test() {
		Retangulo r = new Retangulo();
		assertNotNull(r);
	}

	@Test
	public void testequals() {
		Retangulo c = new Retangulo();
		Retangulo u = new Retangulo();

		assertTrue(c.equals(u));
	}

	@Test
	public void testToString() {
		Retangulo a = new Retangulo(2, 4);
		assertEquals(a.toString(), "largura:2.0altura:4.0");
		System.out.println(a.toString());
	}

	@Test
	public void testAreaRetangulo() {
		Retangulo r = new Retangulo(2, 4);
		assertTrue(r.AreaRetangulo() == 8.0);

	}

	@Test
	public void testAreaRetanguloi() {
		Retangulo r = null;
		assertNull(r);
	}

	@Test
	public void testPerimetro() {
		Retangulo r = new Retangulo(2, 4);
		assertTrue(r.perimetroRetangulo() == 12.0);
	}

	@Test
	public void testgetAltura() {
		Retangulo r = new Retangulo(2, 4);
		assertTrue(r.getAltura() == 4.0);
	}

	@Test
	public void testsetAltura() {
		Retangulo r = new Retangulo();
		r.setAltura(8);
		assertTrue(r.getAltura() == 8.0);
	}

	@Test
	public void testsetLargura() {
		Retangulo r = new Retangulo(2, 4);
		r.setLargura(6);
		assertTrue(r.getLargura() == 6);
	}

	@Test
	public void testgetLargura() {
		Retangulo r = new Retangulo(2, 4);
		assertTrue(r.getLargura() == 2.0);
	}

}
