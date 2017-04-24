package Questao3;

public class Ponto {

	protected double x;
	protected double y;
	
	public Ponto(double x, double y){
		this.x = x;
		this.y= y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double gety(){
		return this.y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		else if(o instanceof Ponto){
			Ponto q = (Ponto) o;
			if (q.x == this.x && q.y == this.y){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return "x:"+this.x+"y"+ this.y;
	}
	
}
