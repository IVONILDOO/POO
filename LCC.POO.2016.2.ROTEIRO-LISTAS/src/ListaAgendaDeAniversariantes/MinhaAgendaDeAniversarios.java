package ListaAgendaDeAniversariantes;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

	ArrayList<Aniversariante> aniversariantes;

	public MinhaAgendaDeAniversarios(ArrayList<Aniversariante> aniversariantes) {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}

	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = (ArrayList<Aniversariante>) new ArrayList<Aniversariante>();
	}

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes, int ano) {
		Aniversariante a = new Aniversariante(nome, dia, mes, ano);
		aniversariantes.add(a);

	}

	@Override
	public ArrayList<String> obterAniversarianteDoMes(int mes) {
		ArrayList<String> aniversariatesDoMes = new ArrayList<String>();
		for(Aniversariante a : this.aniversariantes){
			if(a.ehAniversarianteDoMes(mes)){
				aniversariantes.add(a);
			}
			
		}
		return null;
	}

	@Override
	public void removeAniversariante(String nomeAniversariante) {
		Iterator<Aniversariante> i = aniversariantes.iterator();
		
		while (i.hasNext()) {
			Aniversariante a = i.next();
			if(a.getNome().equals()){
				i.remove();
			}
		}
	}
}
