package Fazenda;

import java.awt.Color;

public abstract class AveVoadora extends Ave implements Voador {
	private Double altitudeVoo;

	AveVoadora(Integer idade , Double tamanho , Color corPena , Double altitudeVoo){
		super(idade, tamanho, corPena);
		this.altitudeVoo = altitudeVoo;
	}
	
	@Override
	public Double getAltitudeVoo() {
		return altitudeVoo;
	}

	public void setAltitudeVoo(Double altitudeVoo) {
		this.altitudeVoo = altitudeVoo;
	}
}
