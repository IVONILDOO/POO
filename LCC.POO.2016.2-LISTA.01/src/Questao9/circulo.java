package Questao9;

public class circulo implements CalculoDasAreas  {
	
	private double r;
	
	public circulo(double r){
		this.r = r;
	}

	@Override
	public double CalculadaArea() {
		return 3.14 * r;
	}

	@Override
	public double CalculaPerimentro() {
		return 2*Math.PI*this.r;
	}

	

}
