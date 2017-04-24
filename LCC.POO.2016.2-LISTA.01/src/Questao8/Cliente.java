package Questao8;

public class Cliente extends Pessoa{
	
	private int codigo;

	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}

	@Override
	public void imprimeDados() {
		System.out.println("Nome: "+ super.nome+ "Nascimento: "+ super.getNascimento()+ "codigo: "+this.codigo);
		
	}




	

}
