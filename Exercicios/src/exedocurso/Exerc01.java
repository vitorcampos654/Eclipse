package exedocurso; 
import java.util.Scanner;
public class Exerc01{
	   public static void main(String[]args) {
		    /*
		    Problema exemplo 
fazer programa para ler as medidas dos lados de dois triangulos X e Y (suponha medidas validas) 
em seguida mostrar o valor da das areas dos
triangulos e dizer qual dos dois triangulos possui maior área. 
A formula para calcular a área de um triangulo a partir das medidas de seus lados A, B, C é a seguintes 
(formula de heron);

        area = V: p(p-a) (p-b) (p-c) onde P= a + b + c
                        
                                                 2 		    */
		   
		   Scanner scan = new Scanner(System.in);
	 
		    Triangulo x,y;
		    x = new Triangulo();
		    y = new Triangulo();
		    
		   
		   
		   System.out.println("Tamanho de triangulo x");
		   x.a = scan.nextDouble();
		   x.b = scan.nextDouble();
		   x.c = scan.nextDouble();
		   
		   System.out.println("");
		   System.out.println("Tamanho de triangulo y");
		   y.a = scan.nextDouble();
		   y.b = scan.nextDouble();
		   y.c = scan.nextDouble();
		   
	    
		 // Chamar o metodo CalcularArea 
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		
		
		  // Imprimir o resultado da busca do tamanhos
		System.out.println("Area de x:"+areaX);
		System.out.println("Area de y:"+areaY); 
		 
		 // Criar um if para saber qual area é maior 
		if(areaX > areaY) {
			 System.out.println("X");
		}else {
			System.out.println("Y");
			 
		}
		
		scan.close();
        
		   
		   
	   }
	
	
}