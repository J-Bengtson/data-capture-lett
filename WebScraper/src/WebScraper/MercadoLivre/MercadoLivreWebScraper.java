package WebScraper.MercadoLivre;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.nodes.Document;

import WebScraper.Produto;
import WebScraper.WebScraper;
import WebScraper.Netshoes.NetshoesWebScraper;

public class MercadoLivreWebScraper extends WebScraper{
	
	

	
	public MercadoLivreWebScraper()
	{
		super();
	}
	
	@Override
	public Produto extrairProduto(String url) 
	{
		Produto produto = new MercadoLivreProduto();
		try {
			Document document = this.requisitaDocument(url);//requisição da pagina
			
			// add informacao extraida da pagina ao produto
			produto.addInformacao( "Nome" , this.extrairDado(document, ".item-title"));
			
			produto.addInformacao( "Preço" ,this.extrairDado(document, "#productInfo > fieldset.item-price"));
			produto.addInformacao( "Descrição" , this.extrairDado(document, ".item-description"));
			produto.addInformacoes(this.extrairDados(document, ".specs-list > li", " > strong" , " > span"));
			
						
		} catch (IOException e) {
			System.out.println("Mercado Livre : Não foi possível extrair informações da página!");
		}
		return produto;
	}
	
}
