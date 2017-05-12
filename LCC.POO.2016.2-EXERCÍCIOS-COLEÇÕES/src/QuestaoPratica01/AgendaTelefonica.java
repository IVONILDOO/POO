package QuestaoPratica01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaTelefonica {

	private List<Contato> listDeContatos;
	
	
	public AgendaTelefonica(){
		listDeContatos = new ArrayList<Contato>();
	}
	public List<Contato> getContatos(){
		return this.listDeContatos;
	}
	
	public void addContato(Contato c){
		listDeContatos.add(c);
	}
	
	public boolean removerContato(Contato c){
		for(Contato contatos: listDeContatos){
			if(c.equals(contatos)){
				listDeContatos.remove(c);
				return true;	
			}
		}
		return false;
	}
	
	public void removerContatos(String id){
		
		Iterator <Contato> i = listDeContatos.iterator();
		
		while(i.hasNext()){
			Contato a =i.next();
			if(a.getNome().toUpperCase().contains(id.toUpperCase())){
				i.remove();
		}
	}
	
	}
}
