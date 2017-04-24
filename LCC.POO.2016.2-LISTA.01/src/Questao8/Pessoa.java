package Questao8;

  abstract class Pessoa {
	 protected String nome;
	  private static Data nascimento;
	  
	  public Pessoa(String nome, Data nascimento){
		  this.nome = nome;
		  this.setNascimento(nascimento);
		  
	  }
		public abstract void imprimeDados();
		public static Data getNascimento() {
			return nascimento;
		}
		public static void setNascimento(Data nascimento) {
			Pessoa.nascimento = nascimento;
		}
	  
}
