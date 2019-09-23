package WebScraper;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Produto {
	protected Map<String,String> informacao;//estrutura de dados map para alocação de informação estruturada em Chave/Valor
	
	public Produto() {
		informacao = new LinkedHashMap<String,String>();
	}
	
	public void addInformacoes(Map<String, String> map) {
		map.keySet().removeAll(informacao.keySet()); // remove do conjunto map todas as informacoes previamente cadastradas
		informacao.putAll(map);// insere informacoes
	}
	
	public void addInformacao(String chave, String valor) {
		if (chave == null || valor == null || chave.length() == 0 || valor.length() == 0)
			return;
		informacao.put(chave, valor); // insere informacao
	}

	@Override
	public String toString() {
		return "Produto [ "+ informacao +"]";
	}


}
