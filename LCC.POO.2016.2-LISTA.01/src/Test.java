import static org.junit.Assert.*;

import Questao2.Pessoa;

public class Test {

	@org.junit.Test
	public void test() {
		Pessoa p1 = new Pessoa();
		p1.setNome("Roser");
		p1.setIdade(19);
		p1.setAltura(1.66);
		p1.setPeso(65);
		System.out.println(p1);
		assertEquals(p1.toString(), "Nome:Roser Descrição:  peso normal");
	}
	
	@org.junit.Test
	public void testGetN(){
		Pessoa p1 = new Pessoa();
		p1.setNome("Roser");
		p1.setIdade(19);
		p1.setAltura(1.66);
		p1.setPeso(65);
		assertTrue(p1.getNome().equals("Roser"));
		
		
	}

}
