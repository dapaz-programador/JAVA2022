package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		
Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu sal�rio d� 1� m�s: ");
		String valor1 = entrada.next().replace(",", "."); 
		// A fun��o (.replace(",", ".") serve para subistituir  a "," por "." na fun��o.
		
		System.out.print("Digite o seu sal�rio d� 2� m�s: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu sal�rio d� 3� m�s: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("Soma � " + soma);
		System.out.println("A media � " + soma / 3);
				
		
		entrada.close();		
	}

}
