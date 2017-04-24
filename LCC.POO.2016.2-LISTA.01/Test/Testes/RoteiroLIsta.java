package Testes;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

import RoteiroListas.Aniversariante;
import RoteiroListas.DataAniversario;
import RoteiroListas.MinhaAgendaDeAniversarios;

public class RoteiroLIsta {
	MinhaAgendaDeAniversarios m;
	
	@Before
	public void setUp() throws Exception{
		m = new MinhaAgendaDeAniversarios();
		m.adicionarAniversariante("adriano", 12, 14);
	}
		
	@Test
	public void testEquals() {
		DataAniversario d1 = new DataAniversario(12,03,1993);
		DataAniversario d2 = new DataAniversario(12,03,1993);
		DataAniversario d3 = new DataAniversario(03,06,1992);
		assertEquals(d1, d2);
		assertNotEquals(d1,d3);
	}
	
	@Test
	public void testehAniversarianteDoMes() {
		Aniversariante a1 = new Aniversariante("roger",12,02,1989);
		assertTrue(a1.ehAniversarianteDoMes(02));
		assertFalse(a1.ehAniversarianteDoMes(10));
		
	}
	
	@Test
	public void testAdicionarAniversariante(){
	m.removerAniversariante("adriano");
	assertEquals(0,m.obterAniversariantesDoMes(12).size());
	
	}

}
