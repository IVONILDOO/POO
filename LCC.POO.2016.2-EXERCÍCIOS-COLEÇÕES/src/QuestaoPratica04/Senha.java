package QuestaoPratica04;

public class Senha {

	private String nome;
	private int idade;
	private int cpf;

	public Senha(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		else if(obj instanceof Senha){
			Senha s = (Senha) obj;
			if(this.cpf == s.cpf){
				return true;
			}
		}
		return false;
	}
	
	public int compareTO(Senha s){
		if(this.idade == s.idade){
			return 0;
		}
		else if(this.idade < s.idade){
			return 1;
		}
		else{
			return -1;
		}
	}
	
	public String toString(){
		return "Nome: "+ this.nome+ "Idade: "+ this.idade+ "CPF: "+ this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getCPF() {
		return this.cpf;
	}

	public void setcpf(int cpf) {
		this.cpf = cpf;
	}

}
