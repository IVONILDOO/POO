package ListaAgendaDeAniversariantes;

import java.util.ArrayList;

public interface AgendaDeAniversarios{
	
	public void adicionarAniversariante(String nome, int dia, int mes, int ano);
	public ArrayList<String> obterAniversarianteDoMes(int mes);
	public void removeAniversariante(String nomeAniversariante);


}
