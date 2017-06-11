package QuestaoPratica03;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AgendaEletronicaMap {
	
	private Map<String, Contato> MapContatos;
	
	public AgendaEletronicaMap(){
		MapContatos = new HashMap<String, Contato>();
	}
		
	public Collection<Contato> getMapContatos (){
		return this.MapContatos.values();
	}
	
	public void adicionarContatos(String nome, Contato c){
		MapContatos.put(nome, c);
	}
	
	public boolean removerContatos(String nome, Contato c){
		for(Contato v: MapContatos.values()){
			if(v.equals(c)){
				MapContatos.remove(v);
				return true;
				
			}
		}
		return false;
		
	}
	
	

}
