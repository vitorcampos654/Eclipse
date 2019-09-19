package construtores;

import java.util.Locale;
import java.util.Scanner;


public class ProgramTest {

	public static void main(String[] args) {
	
		 Locale.setDefault(Locale.US);
		 Scanner scan = new Scanner(System.in);
		// Program p = new Program();
		 
		 System.out.println("Informe o nome do produto");
		 String nome = scan.nextLine();
		 System.out.println("Preço");
		 double preco = scan.nextDouble();
		 
		
		 // Criar o objeto ----------------------------------------------------------
			
		 Program p = new Program(nome, preco);
		
		 System.out.println();
		 
		  System.out.println(p.toString());
		  
		  System.out.println("informe o numero de produto adicionado");
		  int  quantidade = scan.nextInt();
		  p.AdicionarProdutos(quantidade);
		  System.out.println();
		  System.out.println("Atualização:"+p.toString());
		  
		  System.out.println("Informe o numero de produtos serem removido");
		  quantidade = scan.nextInt();
		  p.RemoveProdutos(quantidade);
		  System.out.println("Atualização:"+p.toString());
		  
		  
		
		
		
	}

}
