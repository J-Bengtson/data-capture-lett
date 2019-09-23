package Fazenda;

import java.awt.Color;

public class Morcego extends MamiferoVoador{
/*
 * Morcego
- O morcego pode voar.
- O som emitido � um farfalho
 */
	public Morcego(Integer idade, Double tamanho, Color corPelo , Double altitudeVoo) {
		super(idade, tamanho, corPelo , altitudeVoo);
	}

	@Override
	public void emitirSom() 
	{//	implementa fun��o emitirSom()
		System.out.println(new StringBuilder().append(this).append(" emite som : Faaar faaar...").toString());
	}

	@Override
	public String toString() {
		return "Morcego< idade:"+idade +" tamanho:"+tamanho+">";	
	}






}
