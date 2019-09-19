package construtores;
public class Program {
	// Declarar os atributos 
	  
		private String nome;
		private double preco;
		private int quantidade;
		
		//Criar metodo  Construct
		public Program() {
			}
		
		public Program(String nome, double preco, int quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
			
		}
		
		public Program(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;	
		}
		// Fim do metodo Construct
		// Criar os metodos getter e setter
		public String getNome() {
			return nome;
		}
		public void setNome(String n) {
			this.nome = n;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double p) {
			this.preco = p;
		}
		public int getQuantidade() {
			return quantidade;
		}
		
		
		// Fim do metodo get e set
		
		// Criar o metodo  Mostrar valor em estoque
		public double TotalValorEstoque() {
			return preco * quantidade;
		}
		
		// Criar o metodo Adicionar Produtos
		public void AdicionarProdutos(int q) {
			this.quantidade += q;
		}
	    
		 // Criar o metodo Remove Produtos
		public void RemoveProdutos(int q) {
			this.quantidade -= q;
		}
		public String toString() {
			return nome
					+",$"
					+ String.format("%.3f", preco)
					+", "
					+ quantidade
					+ " :Unidade, total valor em estoque: $"
					+ String.format("%.3f",  TotalValorEstoque());
	 	    
			
		}
		
		
	}

	
	

