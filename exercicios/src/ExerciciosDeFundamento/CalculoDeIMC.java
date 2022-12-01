package ExerciciosDeFundamento;

import java.util.Scanner;

public class CalculoDeIMC {
	
	public static void main(String[] args) {
		
		// Calculo de I.M.C, (�ndice de massa corporal)
		//imc = peso / altura�  ou imc = peso / (altura x altura)
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu peso:  ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura:  ");
		// A fun��o (.replace(",", ".") serve para subistituir  a "," por "." na fun��o.
		String valor1 = entrada.next().replace(",", "."); 
		double altura = Double.parseDouble(valor1);
		

		double alturaPot = Math.pow(altura, 2);
		double IMC = (peso / alturaPot);
		
		
		System.out.printf("Seu �ndice de massa corporal �: %.2f imc",IMC);
	
		double resultado = IMC;
						
		String resultadofinal = resultado <= 18.4 ? 
				"abaixo do peso. " : " 0 ";
		resultadofinal = resultado >= 18.5 ? 
				" com peso adequado." : resultadofinal ;
		resultadofinal = resultado >=25 ? 
				" acima do peso." : resultadofinal ;
		
				
		System.out.println(" Voc� est�!  " + resultadofinal);
				
		// Resultado:
		// At� 18,4 = abaixo do peso
		// 18,5 at� 24,9 = peso adequado
		// acima de 25 = acima do peso
			
		
		entrada.close();
	}

}
