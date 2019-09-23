package Fazenda;

import java.awt.Color;

public abstract class MamiferoVoador extends Mamifero implements Voador{
	/*
	 *  Alguns animais voam, mas cada voo tem sua altitude
	 */
	
	private Double altitudeVoo;
	
	MamiferoVoador(Integer idade, Double tamanho, Color corPelo , Double altitudeVoo) {
		super(idade, tamanho, corPelo);
		this.altitudeVoo = altitudeVoo;
	}
	
	@Override
	public abstract void emitirSom();

	
	
	public Double getAltitudeVoo() {
		return altitudeVoo;
	}

	public void setAltitudeVoo(Double altitudeVoo) {
		this.altitudeVoo = altitudeVoo;
	}

}
