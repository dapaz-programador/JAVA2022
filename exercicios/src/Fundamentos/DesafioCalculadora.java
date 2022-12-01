package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
		// ler numoro 1
		// ler numero 2
		// digitar operação + - * / %
		
		public static void main(String[] args) {
	
			Scanner entrada = new Scanner (System.in);
			
			System.out.print("Digite o primeiro número: ");
			double numero1 = entrada.nextDouble();
			
			System.out.print("Digite  a operação:  ");
			String operacao = entrada.next();
			
			System.out.print("Digite o segundo número ");
			double numero2 = entrada.nextDouble();
			
			
			// Logica ou calculo
			double resultado = "+".equals(operacao) ? numero1 + numero2 :0;
			resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
			resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
			resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
			resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
			
			// quando coloca { " %f" serve para exibir um double }
		    //	e quando colocamos ".2" no meio (%.2f) é para exibir até dus casas decimais apos a virgula. 
			// quando coloca { " %s" serve para exibir uma String  }			
			System.out.printf("%.2f %s %.2f = %.2f",
					numero1, operacao, numero2, resultado );
	
			entrada.close();		
			
		}
	

}
