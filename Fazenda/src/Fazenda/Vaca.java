package Fazenda;

import java.awt.Color;

public class Vaca extends Mamifero{
/*
 * Vaca
- O som emitido é o mugido.
 */
	public Vaca(Integer idade, Double tamanho, Color corPelo) {
		super(idade, tamanho, corPelo);
	}

	@Override
	public void emitirSom() 
	{////	implementa função emitirSom()
		System.out.println(new StringBuilder().append(this).append(" emite som : Muuu muuu...").toString());
	}
	
	@Override
	public String toString() {
		return "Vaca< idade:"+idade+" tamanho:"+tamanho+">";
	}


}
