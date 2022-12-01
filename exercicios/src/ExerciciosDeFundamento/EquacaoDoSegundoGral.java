package ExerciciosDeFundamento;

import java.util.Scanner;

public class EquacaoDoSegundoGral {
	
	public static void main(String[] args) {
		
		
		/*Criar um programa que resolve equa��es do segundo grau
		 * (ax2+bx+c=0) utilizando a f�rmula de Bhaskara. 
		 * Use como exemplo a=1, b=12 e c=-13. Encontre o delta
		 */
	Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o valor de a: ");
		String valorA = entrada.next().replace(",", "."); 
		double a = Double.parseDouble(valorA);
		
		System.out.print("Digite o valor de b: ");
		String valorB = entrada.next().replace(",", "."); 
		double b = Double.parseDouble(valorB);
		
		System.out.print("Digite o valor de c:  ");
		String valorC = entrada.next().replace(",", "."); 
		double c = Double.parseDouble(valorC);
		
		//System.out.printf(" A equa��o fica assim. (%.1fx2 + %.1fx + %.1f = 0)", a, b, c  );
		
        //calculo formula de Bhaskara
		
		// 1� achar o delta
		double potDaRaiz = Math.pow(b, 2);
		double Delta = potDaRaiz - (4 * a * c);
						
		System.out.printf("o delta �: %.2f", Delta );
		
	    // comando para achar raiz quadrada �: " Math.sqrt();
		double raizDeDelta = Math.sqrt(Delta);
		double superior = - (b);
 		double inferior = 2 * a;
		
 		//2� achar x�=?
 		double x1 = (superior + raizDeDelta) / inferior;
 		double x2 = (superior - raizDeDelta) / inferior;
 		
 		System.out.println("Conjunto solu��o �: x�= "+ x1 + " � x�= "+ x2);
		
		
		entrada.close();
		
	}

}
