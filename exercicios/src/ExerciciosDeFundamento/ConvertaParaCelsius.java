package ExerciciosDeFundamento;

import java.util.Scanner;

public class ConvertaParaCelsius {
	public static void main(String[] args) {
		
	// (ºF - 32) x 5/9 = °C
	// (ºC x 9/5) + 32 = ºF	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite valor em fahrenit:  ");
		double valor = entrada.nextDouble();
		

		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double fahrenheit = valor;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		//System.out.println("O resultado e " + celsius +" °C ");
		System.out.printf("é igual a: %.2f °C",celsius);
		
		entrada.close();
		
	}

}
