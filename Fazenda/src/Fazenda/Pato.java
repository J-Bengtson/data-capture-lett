package Fazenda;

import java.awt.Color;

public class Pato extends AveVoadora{
/*
 * Pato
- O pato pode voar.
- O som emitido é um grasnido
 */
	public Pato(Integer idade, Double tamanho, Color corPena, Double voo) {
		super(idade, tamanho, corPena, voo);
	}

	@Override
	public void emitirSom() 
	{ //	implementa função emitirSom()
		System.out.println(new StringBuilder().append(this).append(" emite som : Quack ...").toString());
	}
	
	@Override
	public String toString() {
		return "Pato< idade:"+idade+" tamanho:"+tamanho+">";
	}

}
