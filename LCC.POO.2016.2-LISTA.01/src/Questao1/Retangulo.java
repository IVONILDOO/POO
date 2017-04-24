package Questao1;

public class Retangulo {
	protected double largura;
	protected double altura;
	
	public Retangulo(){
		
	}
	
	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public double AreaRetangulo(){
	return largura * altura;
	}
	public double perimetroRetangulo(){
		return (2*(altura+largura));
	}
	public String toString(){
		return "largura:"+ this.largura+"altura:"+this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double getAltura(){
		return altura;
	}
	public void setLargura(double largura){
		this.largura = largura;
	}
	public double getLargura(){
		return largura;
	}
	
	public boolean equals(Object o){ 
		if (o == null){
			return false;
		}
		else if(o instanceof Retangulo){
			Retangulo r = (Retangulo) o;
			if(r.altura ==this.altura && r.largura == this.largura){
				return true;
			}
			}
		return false;
		}
	}


