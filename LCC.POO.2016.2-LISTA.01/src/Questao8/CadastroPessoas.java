package Questao8;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

	private List<Pessoa> pessoas;

	public CadastroPessoas() {
		pessoas = new ArrayList<Pessoa>();
	}

	public void CadastraPessoas(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}

	public void imprimeCadastro() {
		for (Pessoa k : pessoas) {
			k.imprimeDados();
		}
	}
}
