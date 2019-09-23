import java.awt.Color;
import java.util.Scanner;

import Fazenda.*;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("Selecione um número para instanciar animal e imprimir seus valores : 1) Morcego 2) Vaca 3) Pato 4) Galinha - 0)Sair");
			while( (flag = scan.nextInt()) > 4 || flag < 0);
			
			if(flag == 0)
				System.exit(1);
			
			System.out.println("Informe valor inteiro para idade : ");
			Integer idade = Integer.parseInt(scan.next());
			System.out.println("Informe valor decimal para tamanho do animal em metros: ");
			Double tamanho = Double.parseDouble(scan.next());
			System.out.println("Informe valor RGB (3 valores inteiros entre 0 e 255) : ");
			Integer RedColor = Integer.parseInt(scan.next());
			Integer GreenColor = Integer.parseInt(scan.next());
			Integer BlueColor = Integer.parseInt(scan.next());
			Color corRevestimento = new Color(RedColor, GreenColor, BlueColor);
			
			
			Animal animal = null;
			switch(flag) {
			case 1:
				System.out.println("Informe a altitude do voo : " );
				Double altitudeVoo = Double.parseDouble(scan.next());
				animal = new Morcego(idade , tamanho , corRevestimento , altitudeVoo);
				break;
			case 2:
				animal = new Vaca(idade,tamanho,corRevestimento);
				break;
			case 3:
				System.out.println("Informe a altitude do voo : " );
				altitudeVoo = Double.parseDouble(scan.next());
				animal = new Pato(idade , tamanho , corRevestimento , altitudeVoo);
				break;
			case 4:
				animal = new Galinha(idade,tamanho,corRevestimento);
				break;
			}
			
			animal.emitirSom();
			if(animal instanceof Mamifero) {
				((Mamifero) animal).amamentar();
			}else if(animal instanceof Ave) {
				((Ave)animal).botarOvo();
			}
			
			if(animal instanceof Voador) {
				((Voador)animal).voar();
			}
			
			System.out.println();
			
		}while( true );
	}

}
