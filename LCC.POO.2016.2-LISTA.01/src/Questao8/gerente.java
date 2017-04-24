package Questao8;

public class gerente extends Funcionario{
	private String area;
	
	public gerente(String nome, Data nascimento, float salario, String area){
		super(nome, nascimento, salario);
		this.area = area;
	}
	public float calculaImposto(){
		return (float) (salario*0.05);
	}

	public void imprimeDados(){
		System.out.println("Nome"+ super.nome+"nascimento: "+ super.getNascimento()+"salario: "+super.salario+"area "+this.area+ calculaImposto());
	}

}
