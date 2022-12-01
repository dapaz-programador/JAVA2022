package ExerciciosDeFundamento;

import java.util.Scanner;

public class CalculoDeIMC {
	
	public static void main(String[] args) {
		
		// Calculo de I.M.C, (Índice de massa corporal)
		//imc = peso / altura²  ou imc = peso / (altura x altura)
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu peso:  ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura:  ");
		// A função (.replace(",", ".") serve para subistituir  a "," por "." na função.
		String valor1 = entrada.next().replace(",", "."); 
		double altura = Double.parseDouble(valor1);
		

		double alturaPot = Math.pow(altura, 2);
		double IMC = (peso / alturaPot);
		
		
		System.out.printf("Seu índice de massa corporal é: %.2f imc",IMC);
	
		double resultado = IMC;
						
		String resultadofinal = resultado <= 18.4 ? 
				"abaixo do peso. " : " 0 ";
		resultadofinal = resultado >= 18.5 ? 
				" com peso adequado." : resultadofinal ;
		resultadofinal = resultado >=25 ? 
				" acima do peso." : resultadofinal ;
		
				
		System.out.println(" Você está!  " + resultadofinal);
				
		// Resultado:
		// Até 18,4 = abaixo do peso
		// 18,5 até 24,9 = peso adequado
		// acima de 25 = acima do peso
			
		
		entrada.close();
	}

}
