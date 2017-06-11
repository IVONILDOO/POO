package QuestaoPratica03;

public class Contato {
	private int numero;
	private String email;

	public Contato(int numero, String email) {
		this.numero = numero;
		this.email = email;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		else if(obj instanceof Contato){
			Contato cont = (Contato) obj;
			if (cont.numero == this.numero && this.email == cont.email){
			return true;
			
		}
	}
		return false;

}
}
