package Fazenda;

import java.awt.Color;

public abstract class Revestimento {
	
	private Color cor;

	Revestimento(Color cor){
		this.setCor(cor);
	}
	
	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

}
