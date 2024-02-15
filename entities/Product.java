package entities;

public class Product {
     
	private String nome;
	private double preço;
	private int quantidade;
	
	public Product() {
		
	}
	
	// Construtor com os tres argumentos!!
	
	public Product(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
	
	// construtor com dois argumentos(Sobrecarga do Product)
	
	public Product(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	   
	}
	
	// obtem o nome do produto
	public String  getNome() {
		return nome;
	}
	
	// troca o nome do produto
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// obtem o nome do produto 
	public double getPreço() {
		return preço;
	}
	
	// troca o valor do produto
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	// protege e mantem quantidade do produto estaja consistente 
	public int getQuantidade() {
		return quantidade;
	}
	
	public double valorTotalemEstoque() {
		return preço * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ "
	    + String.format("%.2f", preço) 
	    + ", " 
	    + quantidade 
	    + " units, total: $ "
		+ String.format("%2f", valorTotalemEstoque());

	}
}