package Fazenda;

import java.awt.Color;

public class Galinha extends Ave{
/*
 * Galinha
- O som emitido � um cacarejo
 */
	public Galinha(Integer idade, Double tamanho, Color corPena) {
		super(idade, tamanho, corPena);
	}

	@Override
	public void emitirSom() {
		System.out.println(new StringBuilder().append(this).append(" emite som : Coo� Cooo�...").toString());
	}
	
	@Override
	public String toString() {
		return "Galinha< idade:"+idade+" tamanho:"+tamanho+">";
	}

}
