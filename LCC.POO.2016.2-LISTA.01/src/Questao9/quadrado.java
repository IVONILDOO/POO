package Questao9;

public class quadrado implements CalculoDasAreas {
	
	private double lado;
	
	
	public quadrado(){
		
	}
	
	public quadrado(double lado){
		this.lado = lado;
	}

	
	public double CalculadaArea() {
		
		return lado *lado;
	}

	@Override
	public double CalculaPerimentro() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

}
