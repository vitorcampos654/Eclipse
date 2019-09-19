package exedocurso;

public class Estoque {
	
	// Declarar os atributos 
	  
	public String nome;
	public double preco;
	public int quantidade;
	
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
