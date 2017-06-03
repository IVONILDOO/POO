package Questao01;

public class main {
	public static void main(String[] args) {

		Questao1 p1 = new Questao1(1, 10);
		Thread t1 = new Thread(p1);
		
		Questao1 p2 = new Questao1(11,20);
		Thread t2 = new Thread(p2);
		
		
		t1.start();
		t2.start();

	
}
}