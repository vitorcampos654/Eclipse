package exedocurso;
import java.util.Scanner;

import util.Calculator;

import java.util.Locale;

public class Aplication {
   
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		double raio = scan.nextDouble();
		
		double c = Calculator.circuferencia(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n",c); 
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI valor: %.2f%n", Calculator.PI);
		
		
		 
		 
		
		scan.close();
		
		
	}
	 

}
