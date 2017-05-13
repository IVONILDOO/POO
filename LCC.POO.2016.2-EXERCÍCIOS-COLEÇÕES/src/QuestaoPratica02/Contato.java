package QuestaoPratica02;

public class Contato implements Comparable<Contato> {
	
	private String nome;
	private int numero;
	private String email;
	
	
	public Contato(String nome, int numero, String email){
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}


	@Override
	public int compareTo(Contato c) {
		return this.nome.compareTo(c.nome);
	}
	
	public String getnome(){
		return this.nome;
	}
	
	public void setnome(String nome){
		this.nome = nome;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public String getemail(){
		return this.email;
	}
	
	public void setemail(String email){
		this.email = email;
	}

}
