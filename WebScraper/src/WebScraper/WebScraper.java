package WebScraper;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class WebScraper {
	public WebScraper() {
	}

	/*
	 * Metodo extrairInformacoes(url) faz a extra��o dos dados de uma p�gina HTML
	 * atraves da identifica��o dos elementos pelos selectores CSS.
	 *
	 * Input: (String url) A url da p�gina do produto ser� passada como input.
	 * Output: (Produto) Classe representa de forma gen�rica produto do e-commerce.
	 * 
	 */
	public abstract Produto extrairProduto(String url);

	protected Document requisitaDocument(String url) throws IOException {
		return Jsoup.connect(url).get();
	}

	protected String extrairDado(Element document, String selector) {
		// Realiza extra��o do(s) dado(s) referente ao seletor CSS
		Elements elements = document.select(selector);
		return (elements.size() > 0) ? elements.get(0).text() : elements.text();
	}

	protected Map<String, String> extrairDados(Document document, String selector, String cssQueryKey , String cssQueryValue) 
	{
		// metodo � uma forma automatizada de captura em grande escala e padronizada. 
		// Atributos : selector � a query css a ser extraida do HTML, cssQueryKey � o completo do selector para capturar chave e cssQueryValue � o complemento do selector para capturar valor
		Map<String, String> map = new LinkedHashMap<String, String>(); // Estrutura de dados para aloca��o das
																		// informa��es por inser��o Chave/Valor
																		// (dicion�rio)
		// Realiza extra��o do(s) dado(s) referente ao seletor CSS e armazena-os no map
		Elements elementoRoot = document.select(selector);
		int cout = 0;
		Iterator<Element> iterator = elementoRoot.iterator();
		while(iterator.hasNext()) {
			Element elemento = iterator.next();
			map.put( extrairDado(elemento , cssQueryKey)  , extrairDado(elemento , cssQueryValue));
		}
		return map;
	}

}
