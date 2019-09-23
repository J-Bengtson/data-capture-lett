package WebScraper.Netshoes;

import java.io.IOException;
import java.util.Scanner;

import WebScraper.Produto;
import WebScraper.MercadoLivre.MercadoLivreWebScraper;

public class Main {
	
	public static void main( String[] args ) throws IOException 
	{
		//Acesse o diretorio onde se encontra o arquivo NetshoesWebScraper.jar
		// Execute o comando no terminal 'java -jar NetshoesWebScraper.jar (URL)' juntamente com a url da página
		//ou Execute o comando Execute o comando no terminal 'java -jar NetshoesWebScraper.jar' em seguida a url e tecle ENTER
		// exemplo : java -jar NetshoesWebScraper.jar 
		
		//exemplo de URLS : https://www.netshoes.com.br/camiseta-nike-breathe-spring-masculina-grafite-HZM-0689-266
		// https://www.netshoes.com.br/lampada-inteligente-para-barracas-tent-megalite-guepardo-lc0300-branco-221-9120-014	
		// https://www.netshoes.com.br/bola-de-futebol-campo-adidas-starlancer-v-branco-COL-3359-014
		NetshoesWebScraper netshoes_scraper = new NetshoesWebScraper();
		if(args.length == 0)
			System.out.print("Netshoes produto URL : ");
		Produto produto = netshoes_scraper.extrairProduto( (args.length > 0 ? args[0].trim() :  new Scanner(System.in).nextLine().trim()));	
		System.out.println();
		System.out.println(produto.toString());
	}

}
