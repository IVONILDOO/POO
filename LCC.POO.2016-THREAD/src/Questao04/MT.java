package Questao04;



//                   ******
//                   *
//RESPOSTA LETRA     ****
// (E)               *
//                   ******






public class MT implements Runnable{

	String ms = "S ";
	@Override
	public void run() {
		this.ms = "N";
		
	}
	
	public static void main(String[] args){
		MT t = new MT();
		new Thread(t).start();
		for (int i=0; i<10; i++)
			System.out.println(t.ms);
	}
	

}

