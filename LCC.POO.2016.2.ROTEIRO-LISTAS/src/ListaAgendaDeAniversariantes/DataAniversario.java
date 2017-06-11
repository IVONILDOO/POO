package ListaAgendaDeAniversariantes;

public class DataAniversario {

	private int dia;
	private int mes;
	private int ano;
	
	public DataAniversario(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
	
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		}
		
		else if(obj instanceof DataAniversario){
			DataAniversario d = (DataAniversario) obj;
			if (d.dia == this.dia && d.mes == d.mes && d.ano == d.ano){
				return true;
			}
		}
		return false;
	}
}
