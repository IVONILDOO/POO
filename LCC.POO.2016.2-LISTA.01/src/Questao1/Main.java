package Questao1;

public class Main {

	public static void main(String [] args){
		Retangulo r = new Retangulo(2,4);
		r.setAltura(8);
		
		System.out.println(r.AreaRetangulo());
		System.out.println(r.toString());
		System.out.println(r.perimetroRetangulo());
	}
}
