package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		
Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu salário dó 1º mês: ");
		String valor1 = entrada.next().replace(",", "."); 
		// A função (.replace(",", ".") serve para subistituir  a "," por "." na função.
		
		System.out.print("Digite o seu salário dó 2º mês: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o seu salário dó 3º mês: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("Soma é " + soma);
		System.out.println("A media é " + soma / 3);
				
		
		entrada.close();		
	}

}
