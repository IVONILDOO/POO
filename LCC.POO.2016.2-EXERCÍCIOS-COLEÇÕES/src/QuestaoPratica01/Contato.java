package QuestaoPratica01;

public class Contato {
	private String nome;
	private int numero;
	private String email;
	
	public Contato(String nome, int numero, String email){
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		else if(obj instanceof Contato){
			Contato cont =  (Contato) obj;
			if(this.nome == cont.nome && this.numero == cont.numero && this.email == cont.email){
				return true;
			}
		}
		return false;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
