package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		// o simbolo " && " significa " media menor igual a 10 "e" maior igual a 7. 
		if(media <=10 && media >= 7.0) {
		   System.out.println(" Aprovado!");
		   System.out.println(" Parab�ns!");
		        }
		   
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o! ");
				}
		
	//	if(media < 4.5 && media >= 0) {
	//		System.out.println("Reprovado! ");
	//	        }
		// outra forma ex:
		boolean criterioReprovacaoAtingindo = 
				media < 4.5 && media >= 0;
				
		if(criterioReprovacaoAtingindo) {
			System.out.println("Reprovado! ");
		}
		entrada.close();

		}
}
