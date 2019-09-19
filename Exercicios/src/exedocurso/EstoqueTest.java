package exedocurso;
import java.util.Locale;
import java.util.Scanner;

public class EstoqueTest {
   /*Exemplo 

  Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque)
  em seguida:
  
  .Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total no estoque)
  .Realizar uma entrada no estoque e mostrar novamente os dados do produto
  .Realizar uma saida no estoque e mostrar novamente os dados do produto


Para resolver este problema voce dever criar uma classe conforme abaixo 

Produto 
String nome
double preço
int quantidade
------- Metodo
+Total()
+AdicioProdutos()
+RemoveProdutos()*/
	
	public static void main(String[] args) {
         Locale.setDefault(Locale.US);
		 Scanner scan = new Scanner(System.in);
		 // Criar o objeto
		 Estoque e = new Estoque();
		 
		 System.out.println("Informe o nome do produto");
		 e.nome = scan.nextLine();
		 System.out.println("Preço");
		 e.preco = scan.nextDouble();
		 System.out.println("Quantidade em Estoque:");
		 e.quantidade = scan.nextInt();
		  
		 
		  System.out.println(e.toString());
		  
		  System.out.println("informe o numero de produto adicionado");
		  int quantidade = scan.nextInt();
		  e.AdicionarProdutos(quantidade);
		  System.out.println();
		  System.out.println("Atualização:"+e.toString());
		  
		  System.out.println("Informe o numero de produtos serem removido");
		  quantidade = scan.nextInt();
		  e.RemoveProdutos(quantidade);
		  System.out.println("Atualização:"+e.toString());
		  
		  
		  
	}

}
