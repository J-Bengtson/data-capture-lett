package Fazenda;

import java.awt.Color;

public abstract class Mamifero extends Animal{
	/*
	 * Mamifero é uma sub-classe abstrata derivada de Animal.
	 * 
	 * Sabemos também que os mamíferos desta fazenda possuem pelo(o que diferencia são as cores do pelo) e amamentam. 
	 */
	
	Mamifero(Integer idade, Double tamanho , Color corPelo) {
		super(idade, tamanho, corPelo);
		this.setRevestimento(new Pelo(corPelo));
	}

	@Override
	public abstract void emitirSom();
	//delega-se função emitirSom() para que seja implementada nas sub-classes ( Morcego (MamiferoVoador) e Vaca)

	
	public void amamentar() {
		System.out.println(new StringBuilder().append(this.toString()).append(" ").append("amamentando...").toString());
	}
	
	public Pelo getPelo() {
		return (Pelo) super.getRevestimento();
	}
	

}
