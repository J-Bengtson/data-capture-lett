package Fazenda;

import java.awt.Color;

public abstract class Mamifero extends Animal{
	/*
	 * Mamifero � uma sub-classe abstrata derivada de Animal.
	 * 
	 * Sabemos tamb�m que os mam�feros desta fazenda possuem pelo(o que diferencia s�o as cores do pelo) e amamentam. 
	 */
	
	Mamifero(Integer idade, Double tamanho , Color corPelo) {
		super(idade, tamanho, corPelo);
		this.setRevestimento(new Pelo(corPelo));
	}

	@Override
	public abstract void emitirSom();
	//delega-se fun��o emitirSom() para que seja implementada nas sub-classes ( Morcego (MamiferoVoador) e Vaca)

	
	public void amamentar() {
		System.out.println(new StringBuilder().append(this.toString()).append(" ").append("amamentando...").toString());
	}
	
	public Pelo getPelo() {
		return (Pelo) super.getRevestimento();
	}
	

}
