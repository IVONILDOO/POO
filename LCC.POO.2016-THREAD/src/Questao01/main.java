package Questao01;

public class main {
	public static void main(String[] args) {
		

		Questao1 p1 = new Questao1(1, 1000);
		Thread t1 = new Thread(p1);
		
		Questao1 p2 = new Questao1(1001,2000);
		Thread t2 = new Thread(p2);
		
		Questao1 p3 = new Questao1(2001,3000);
		Thread t3 = new Thread(p3);
		
		Questao1 p4 = new Questao1(3001,4000);
		Thread t4 = new Thread(p4);
		
		Questao1 p5 = new Questao1(4001,5000);
		Thread t5 = new Thread(p5);
		
		Questao1 p6 = new Questao1(5001,6000);
		Thread t6 = new Thread(p6);
		
		Questao1 p7 = new Questao1(6001,7000);
		Thread t7 = new Thread(p7);
		
		Questao1 p8 = new Questao1(7001,8000);
		Thread t8 = new Thread(p8);
		
		Questao1 p9 = new Questao1(8001,9000);
		Thread t9 = new Thread(p9);
		
		Questao1 p10 = new Questao1(9001,10000);
		Thread t10 = new Thread(p10);
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		

	
}
}