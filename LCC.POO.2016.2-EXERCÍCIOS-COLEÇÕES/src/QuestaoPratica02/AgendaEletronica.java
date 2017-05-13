package QuestaoPratica02;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import QuestaoPratica01.Contato;

public class AgendaEletronica {

	private TreeSet<Contato> Tcontatos;

	public AgendaEletronica() {
		Tcontatos = new TreeSet<Contato>();
	}

	public TreeSet<Contato> getContatos() {
		return this.Tcontatos;
	}

	public void addContato(Contato c) {
		Tcontatos.add(c);
	}

	public boolean removerContato(Contato c) {
		for (Contato contatos : Tcontatos) {
			if (c.equals(contatos)) {
				Tcontatos.remove(c);
				return true;
			}
		}
		return false;
	}

	public void removerContatos(String id) {

		Iterator<Contato> i = Tcontatos.iterator();

		while (i.hasNext()) {
			Contato a = i.next();
			if (a.getNome().toUpperCase().contains(id.toUpperCase())) {
				i.remove();
			}
		}
	}
}
