package WebScraper.Netshoes;

import java.io.IOException;
import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import WebScraper.WebScraper;


public class NetshoesWebScraper extends WebScraper
{

	// Utiliza-se biblioteca Jsoup e e-commerce escolhido foi Netshoes (www.netshoes.com.br).
	public NetshoesWebScraper(){
		super();
	}

	/*
	 * Metodo extrairInformacoes(url) faz a extração dos dados de uma página HTML atraves da identificação dos elementos pelos selectores CSS.
	 *
	 * Input: (String url) A url da página do produto será passada como input.
	 * Output: (Produto) Classe representa de forma genérica produto do e-commerce.
	 * 
	 */
	public NetshoesProduto extrairProduto(String url)

	{
		NetshoesProduto produto = new NetshoesProduto();

		try {
			Document document = requisitaDocument(url); //Realiza requisição e captura da página
			
			
			//extrai dados e add atributo a produto
			produto.addInformacao("Nome:" , extrairDado(document , ".short-description > [itemprop=name]"));
			produto.addInformacao("Ref.:" , extrairDado(document, ".reference > span"));
			produto.addInformacao("Preço:", extrairDado(document , "[itemprop=price]"));
			produto.addInformacao("Descrição:" , extrairDado(document , "[itemprop=description]") );
			
			produto.addInformacao("Gênero:" , extrairDado(document , ".attributes li:nth-child(2)"));
			produto.addInformacao("Indicado para:" , extrairDado(document , ".attributes > li:nth-child(3)"));
			produto.addInformacao( "Origem:" , extrairDado(document ,  ".attributes > li:last-child"));			
			produto.addInformacoes( extrairDados(document , ".attributes > li" , " > strong" , ":not(strong)"));
			
			
		} catch (IOException e) 
		{
			System.out.println("Netshoes : Não foi possível extrair informações da página!");
		}
		
		return produto; // retorna produto
		
	}
	


	
	
}
		
		
		
	
