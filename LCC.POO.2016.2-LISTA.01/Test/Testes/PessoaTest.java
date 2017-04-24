package Questao2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testgetNome(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		assertTrue(p.getNome() == "marcos");
	}
	
	@Test
	public void testsetNome(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		p.setNome("rick");
		assertTrue(p.getNome() == "rick");
	}
	
	@Test
	public void testgetIdade(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		assertTrue(p.getIdade()==20);
		
	}
	@Test
	public void testsetIdade(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		p.setIdade(21);
		assertTrue(p.getIdade() == 21);
		
	}
	@Test
	public void testgetaltura(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		assertTrue(p.getAltura() ==  1.62);
	}
	
	@Test
	public void testsetAltura(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		p.setAltura(1.63);
		assertTrue(p.getAltura() == 1.63);
	}
	@Test
	public void testgetPeso(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		assertTrue(p.getPeso() == 63);
	}
	
	@Test 
	public void testsetPeso(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		p.setPeso(65);
		assertTrue(p.getPeso() == 65);
	}
	
	@Test 
	public void testCalculoImc(){
		Pessoa p = new Pessoa("marcos", 20,1.62,63);
		assertTrue(p.CalculoImc() == 19.444444444444443);
	}
	@Test
	public void testtoString(){
		Pessoa p1 = new Pessoa("marcelo", 20,1.92,63);
		assertEquals(p1.toString(), "Nome:marcelo Descrição:  Abaixo do peso normal");
		
		Pessoa p2 = new Pessoa("marcos", 20,1.62,63);
		assertEquals(p2.toString(), "Nome:marcos Descrição:  peso normal");
		
		Pessoa p3 = new Pessoa("rick", 20,1.60,90);
		assertEquals(p3.toString(), "Nome:rick Descrição:  Acima do peso");
		
		Pessoa p4 = new Pessoa("Rodolfo", 20,1.50,120);
		assertEquals(p4.toString(), "Nome:Rodolfo Descrição:  Obesidade");
	
		System.out.println(p2.toString());
		
	}
}
