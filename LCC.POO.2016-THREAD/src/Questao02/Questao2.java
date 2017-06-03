package Questao02;

public class Questao2 implements Runnable {

	
		static private int cont = 0;
		private boolean cond = true;
	
	
	
	@Override
	public void run() {
		
		while(cond){
			
		}
		
	}
	
	public synchronized void setCont(int cont){
		this.cont = cont;
	}
	
	public int getCont(){
		return this.cont;
	}
	
	public void setCond(){
		cond = false;
	}

	
}
