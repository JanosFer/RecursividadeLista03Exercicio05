package view;

import controller.FibonnaciController;

public class Principal {
	public static void main(String[] args) {
		FibonnaciController fc = new FibonnaciController();
		
		int n = 10;
		
		System.out.println("A sequência de fibonnaci de '" +n+ "' é de: " +fc.fibonnaci(n));
	}
}
