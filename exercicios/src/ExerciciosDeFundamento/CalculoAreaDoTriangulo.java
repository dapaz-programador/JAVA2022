package ExerciciosDeFundamento;

import java.util.Scanner;

public class CalculoAreaDoTriangulo {
	
	public static void main(String[] args) {
		
		/* Criar um programa que leia o valor da base e da altura
		 * do tri�ngulo � calcule a �rea.
		 */
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Qual o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("�rea do triangulo �: %.2f", area);
		
		entrada.close();
		
		
	}

}
