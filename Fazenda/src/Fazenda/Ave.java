package Fazenda;

import java.awt.Color;

public abstract class Ave extends Animal{
	/*
	 * Implementa m�todos e atributos da classe Animal
	 * Sabemos que todas as aves desta fazenda botam ovos e tem pena (o que diferencia s�o as cores da pena). 
	 */
	Ave(Integer idade, Double tamanho, Color corPena) {
		super(idade, tamanho, corPena);
		this.setRevestimento(new Pena(corPena));
	}

	@Override
	public abstract void emitirSom();
	//delega-se fun��o emitirSom() para que seja implementada nas sub-classes ( Pato (AveVoadora) e Galinha)

	public void botarOvo() {
		System.out.println(new StringBuilder().append(this.toString()).append(" ").append("botando ovo...").toString());
	}
}
