package Questao8;

public class Funcionario extends Pessoa {
	protected float salario;

	public Funcionario(String nome, Data nascimento, float salario) {
		super(nome, nascimento);
		this.salario = salario;
	}
			
	public float calculaImposto(){
		return (float) (salario*0.03);
	}

	@Override
	public void imprimeDados(){
		 System.out.println("Nome"+super.nome+ "data: "+super.getNascimento() + "salario: "+ this.salario+ calculaImposto());
		
	}
}


