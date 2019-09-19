package exedocurso;
import java.util.Scanner;

public class Banco {
	 
	  public static void main(String[]args) {
		    // Criar objeto Scanner
		  Scanner scan = new Scanner(System.in);
		  int menu;
		  int i;
		     // Criar o objeto 
		  Conta p1 = new Conta();
		  
		  System.out.println("Insira o nome do cliente:");
		  p1.setNome(scan.nextLine());
		  
		  System.out.println("Insira o saldo inicial do cliente:");
		  p1.setSaldo(scan.nextDouble());
		  
		  
		  // Chamar o metodo status
		  p1.status();
		  for ( i = 0; i < 10; i++) {
		  System.out.println("");
          System.out.println("Banco do brasil");
          System.out.println("Saque-> 1");
          System.out.println("Deposito-> 2");
          menu = scan.nextInt();
		  switch(menu) {
		  case 1:
			  System.out.println("Saque");
			  System.out.println("Informe valor do saque:");
			  p1.sacar(scan.nextInt());
			  break;
		  case 2:
			  System.out.println("Deposito");
			  System.out.println("Informe valor do deposito:");
			  p1.depositar(scan.nextDouble());
		  }

		  // Chamar o metodo status
		  p1.status();
		  
		  }
		  
	  }
	
	
}