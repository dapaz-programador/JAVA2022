package Fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
	
		
	// (ºF - 32) x 5/9 = °C
		
		
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double fahrenheit = 40;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado e " + celsius +" °C. ");
		
		// tecla de atalho " Alt + cima ou baixo. move a linha 
		// tecla de atalho ctrl + Alt + cima ou baixo. dulplica a linha
		
		
	}

}
