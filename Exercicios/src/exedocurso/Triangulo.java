package exedocurso;

public class Triangulo {
	
	 // Declarar os atributos
	
	double a;
	double b;
	double c;
	/*
	 area = V: p(p-a) (p-b) (p-c) onde P= a + b + c
             
             2 		    */
	
	
	
	 // Criar o metodo calcular area 
	
	 public double calcularArea() {
		 double  p = (a + b+ c) / 2.0;
		 double result = Math.sqrt(p * (p-a)* (p - b)* (p -c));
		 return result;
		 
		 
	 }

}
