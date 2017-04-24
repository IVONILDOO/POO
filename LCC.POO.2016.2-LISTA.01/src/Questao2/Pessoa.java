package Questao2;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa(){
	
	}
	public Pessoa(String nome, int idade, double altura, double peso){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		
	}
		
		public String getNome(){
			return this.nome;
		}
		
		public void setNome(String nome){
			this.nome = nome;
		}
	
		public int getIdade(){
			return this.idade;
		}
		
		public void setIdade(int idade){
			this.idade = idade;
		}
		
		public double getAltura(){
			return this.altura;
		}
	
		public void setAltura(double altura){
			this.altura = altura;
		}
		
		public double getPeso(){
			return this.peso;
		}
	 
		public void setPeso(double peso){
			this.peso = peso;
		}
		
		public double CalculoImc(){
		return this.peso/ (this.altura *2);
			
		}
	
		
		public String toString(){
			String descri��o = null;
			if (CalculoImc() <= 18.5){
				descri��o =" Abaixo do peso normal";
			}
			else if (18.5 < CalculoImc()  && CalculoImc() <= 25){
				descri��o = " peso normal";
			}
			else if (25<CalculoImc() && CalculoImc()<= 30){
				descri��o = " Acima do peso";
			}
			
			else if (CalculoImc()>30){
				descri��o = " Obesidade";
			}
			return "Nome:"+ this.nome+ " Descri��o: "+ descri��o;
			
			
		}
	
	
	

}
