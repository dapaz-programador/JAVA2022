package ExerciciosDeFundamento;

import java.util.Scanner;

public class QuadradoEaoCubo {

	public static void main(String[] args) {
		
		/*Criar um programa que leia um valor e apresente os
		 * resultados ao quadrado e ao cubo do valor.
		 */
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		double numero = entrada.nextDouble();
		
		double dobro = Math.pow(numero, 2);
		double triplo = Math.pow(numero, 3);
		System.out.printf(" O dobro do valor é: %.3f, eo tríplo é %.3f ",dobro, triplo);
		
		entrada.close();
	}
}
