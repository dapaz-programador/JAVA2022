package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		// (printf) utilizado para imprimir simbolos e numeros n�o inteiros
		System.out.printf("Mega sena: %d %d %d %d %d %d %n"  // (%n) tamb�m e utilizado como quebra de linha
				, 1, 2, 3, 4, 5, 6);
		// (%1f) imprime valores com pontos flutuantes ou numeros que tenha virgul
		System.out.printf("Salario: %.1f %n", 1234.5678);
		
		// (%s)
		System.out.printf("Nome: %s%n", "Jo�o");
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
				
		System.out.printf("%s %s tem %d anos.%n", 
				nome, sobrenome, idade);
		
		entrada.close();		
		
	}

}
