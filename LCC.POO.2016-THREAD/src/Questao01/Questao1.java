package Questao01;

public class Questao1 implements Runnable {
	private int inicio;
	private int Final;
	
	
	public Questao1(int inicio, int Final){
		this.inicio = inicio;
		this.Final = Final;
	}

	public void run() {
		for(int i = inicio; i <= Final; i++){
			if(Primo(i)==true){
				System.out.println(i);
			}
		}
		
		    }
	
	
	public boolean Primo(int num){
		
		 for (int i = 1; i<= num; i++){
			 if (num%i == 0){
				 if(i != num && i !=1 ){
					 return false;
				 }
			 }
		     
		   
	}
		return true;
	}
}


			
	