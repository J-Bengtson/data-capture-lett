package Fazenda;

import java.awt.Color;

public abstract class Animal implements Comparable<Revestimento>{
	
	/*
	 * Animal,classe abstrata, proveem base para sub-classes

	 * Cada animal possui os seguintes atributos e a��es:
	- Idade (atributo)
	- Tamanho (atributo)
	- Som emitido (a��o)
	*/
	/*
	 * Existem 2 tipos de animais, aves (pato, galinha) e mam�feros(vaca e morcego)
	 * (o que diferencia s�o as cores das penas/pelos (Revestimento))
	 * 
	 */
	
	protected Integer idade;
	protected Double tamanho;
	protected Revestimento revestimento;
	
	
	Animal(Integer idade, Double tamanho, Color cor){
		this.setIdade(idade);
		this.setTamanho(tamanho);
	}

	
	public abstract void emitirSom();
	//delega-se fun��o emitirSom() para que seja implementada nas sub-classes ( Mamifero e Ave)
	
	
	@Override
	public int compareTo(Revestimento revestimento) { //compara as cores das penas/pelos (Revestimento))
		/*retornos poss�veis:
		 * 1: revestimentos s�o incompat�veis
		 * 0:   "      "    s�o iguais
		 * -1:  "      "    s�o diferentes
		 */
		return !(revestimento.getClass().equals(this.getRevestimento().getClass())) ? 1 
			   : (this.getRevestimento().getCor().equals(revestimento.getCor()) ? 0 : -1);
	}
	
	
	/*SETTERS & GETTERS*/

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}

	public Revestimento getRevestimento() {
		return revestimento;
	}

	public void setRevestimento(Revestimento revestimento) {
		this.revestimento = revestimento;
	}
}
