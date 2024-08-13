package controller;

public class FibonnaciController {
	public FibonnaciController() {
		super();
	}
	
	public int fibonnaci(int n) {
		//se n for negativo ou 0 retorna-se 0 e para a chamada da recursiva.
		
		if(n <= 0) {
			return 0;
		}else {
			//se n for igual a 1 ou 2 retorna-se 1 e para a chamada da recursiva.
			
			if(n == 1 || n == 2) {
				return 1;
			}else {
				//senão retorna-se a soma da recursiva com n-1 e da recursiva com n-2;
				
				return fibonnaci(n-1) + fibonnaci(n-2);
			}
		}
	}
}
