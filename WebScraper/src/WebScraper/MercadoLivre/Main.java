package WebScraper.MercadoLivre;

import java.util.Scanner;

import WebScraper.Produto;

public class Main {
	public static void main(String[]args) 
	{
		MercadoLivreWebScraper mercadolivre_scraper = new MercadoLivreWebScraper();
		if(args.length == 0)
			System.out.print("Mercado Livre produto URL : ");
		Produto produto = mercadolivre_scraper.extrairProduto( (args.length > 0 ? args[0].trim() :  new Scanner(System.in).nextLine().trim()));	
		System.out.println();
		System.out.println(produto.toString());	
	}
}
