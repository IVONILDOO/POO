package Questao8;



public class TestaCadastro {
	
	public static void main(String[] args){
		
		Data d = new Data(01, 03, 1994);
		Cliente k = new Cliente("marcus", d,0011);
		
		Data d2 = new Data(04, 02, 1990);
		Funcionario k2 = new Funcionario("Roger", d2, 987);
		

		Data d3 = new Data(12, 04, 1989);
		gerente k3 = new gerente("murilo", d3, 0343, "financeiro");
		
		
		CadastroPessoas c = new CadastroPessoas();
		c.CadastraPessoas(k);
		c.CadastraPessoas(k2);
		c.CadastraPessoas(k3);
		c.imprimeCadastro();
	}

}
