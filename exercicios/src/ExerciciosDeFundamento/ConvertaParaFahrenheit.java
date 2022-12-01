package ExerciciosDeFundamento;

import java.util.Scanner;

public class ConvertaParaFahrenheit {
	
	public static void main(String[] args) {
		
		// (ºF - 32) x 5/9 = °C
		// (ºC x 9/5) + 32 = ºF	
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.print("Digite valor em celsius:  ");
			double valor = entrada.nextDouble();
			

			final double FATOR = 32;
			final double AJUSTE = 1.8;   // == (5.0 / 9.0)
			
			double celsius = valor;
			double fahrenheit = (celsius * AJUSTE) + FATOR;
			//System.out.println("O resultado e " + celsius +" °C ");
			System.out.printf("é igual a: %.2f °F",fahrenheit);
			
			entrada.close();
		
	}

}
