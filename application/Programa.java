package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
		System.out.println("insira os dados do produto: ");
		System.out.print("Nome: ");
	  String name = sc.nextLine();
		
	 	System.out.print("Preço: ");
		 double price = sc.nextDouble();
		 Product product = new Product(name, price);

		// acessa e troca nome do produto
		  product.setNome("computador");
		System.out.println("Nome do produto: " + product.getNome());
		
		// acessa e troca o valor do produto
		product.setPreço(1200.00);
		System.out.println("preço do produto atualizado: " + product.getPreço());
		
		
		System.out.println();
   System.out.println("Dados atualizado: " + product);

		System.out.println();
		System.out.println(" insira a quantidade de produtos a serem adicionados em estoque: ");
		 int quantity = sc.nextInt();
		 product.adicionarProdutos(quantity);
		

		System.out.println();
		System.out.println("Dados atualizado: " + product);

		System.out.println();
		System.out.println("insira a quantidade de produtos a serem retirados do estoque: ");
		   quantity = sc.nextInt();
		     product.removeProdutos(quantity);
 
		System.out.println();
		System.out.println("Dados atualizado no sistema: " + product);
		
		
	sc.close();
		
   
	}

}
