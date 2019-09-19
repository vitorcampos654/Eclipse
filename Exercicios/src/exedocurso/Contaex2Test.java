package exedocurso;
import java.util.Scanner;
import java.util.Locale;

public class Contaex2Test {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// Criar objeto Scanner
		Scanner scan = new Scanner(System.in);
		Contaex2 c1;
		
		System.out.printf("Informe o numero da conta:");
		int numero = scan.nextInt();
		
		System.out.println("Informe o nome do titular:");
		scan.nextLine();
		String titular = scan.nextLine();
		System.out.println("Tem deposito inicial (y/n)");
		char responde = scan.next().charAt(0);
		if(responde == 'y') {
			System.out.println("Entrer com valor inicial");
			double saldoInicial = scan.nextDouble();
			c1  = new Contaex2(numero,titular,saldoInicial) ;
			
			} else {
			  c1 = new Contaex2(numero,titular);	
			}
		  System.out.println("");
		  System.out.println("A sua conta:");
		  System.out.println(c1);
		  
		  System.out.println();
		  System.out.print("Entre com valor deposito:");
		  double depositoValor = scan.nextDouble();
		  c1.depositar(depositoValor);
		  System.out.println("Saldo atualizado:");
		  System.out.println(c1);
		  
		  System.out.println("");
		  System.out.println("Entre com valor para sacar");
		  double Valorsacar = scan.nextDouble();
		  c1.sacar(Valorsacar);
		  System.out.println("Saldo atualizado:");
		  System.out.println(c1);
		  scan.close();
	
	}
			}


