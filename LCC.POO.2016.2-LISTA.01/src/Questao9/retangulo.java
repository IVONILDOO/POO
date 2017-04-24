package Questao9;

public class retangulo implements CalculoDasAreas {
	private double base;
	private double altura;
	
	public retangulo(double lado, double altura){
		this.base = lado;
		this.altura = altura;
	}
	public retangulo(){
		
	}

	@Override
	public double CalculadaArea() {
		
		return this.base * this.altura;
	}

	@Override
	public double CalculaPerimentro() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
