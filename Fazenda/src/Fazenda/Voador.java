package Fazenda;

public interface Voador
{	//Voador "cria contrato/assinatura" com classe(s) que a implementa(m) permitindo obriga-la(s) a utilizar/implementar metodos e atributos da interface 

	public default void voar() {
		System.out.println(new StringBuilder().append(this).append(" ").append("voando a "+this.getAltitudeVoo()+" metros de altitude..."));
	}
	
	public Double getAltitudeVoo();
}
