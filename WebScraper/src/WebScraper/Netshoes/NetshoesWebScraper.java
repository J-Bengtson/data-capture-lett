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
	 * Metodo extrairInformacoes(url) faz a extra��o dos dados de uma p�gina HTML atraves da identifica��o dos elementos pelos selectores CSS.
	 *
	 * Input: (String url) A url da p�gina do produto ser� passada como input.
	 * Output: (Produto) Classe representa de forma gen�rica produto do e-commerce.
	 * 
	 */
	public NetshoesProduto extrairProduto(String url)

	{
		NetshoesProduto produto = new NetshoesProduto();

		try {
			Document document = requisitaDocument(url); //Realiza requisi��o e captura da p�gina
			
			
			//extrai dados e add atributo a produto
			produto.addInformacao("Nome:" , extrairDado(document , ".short-description > [itemprop=name]"));
			produto.addInformacao("Ref.:" , extrairDado(document, ".reference > span"));
			produto.addInformacao("Pre�o:", extrairDado(document , "[itemprop=price]"));
			produto.addInformacao("Descri��o:" , extrairDado(document , "[itemprop=description]") );
			
			produto.addInformacao("G�nero:" , extrairDado(document , ".attributes li:nth-child(2)"));
			produto.addInformacao("Indicado para:" , extrairDado(document , ".attributes > li:nth-child(3)"));
			produto.addInformacao( "Origem:" , extrairDado(document ,  ".attributes > li:last-child"));			
			produto.addInformacoes( extrairDados(document , ".attributes > li" , " > strong" , ":not(strong)"));
			
			
		} catch (IOException e) 
		{
			System.out.println("Netshoes : N�o foi poss�vel extrair informa��es da p�gina!");
		}
		
		return produto; // retorna produto
		
	}
	


	
	
}
		
		
		
	
