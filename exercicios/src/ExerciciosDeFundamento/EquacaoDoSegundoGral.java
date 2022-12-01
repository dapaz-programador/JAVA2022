package ExerciciosDeFundamento;

import java.util.Scanner;

public class EquacaoDoSegundoGral {
	
	public static void main(String[] args) {
		
		
		/*Criar um programa que resolve equações do segundo grau
		 * (ax2+bx+c=0) utilizando a fórmula de Bhaskara. 
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
		
		//System.out.printf(" A equação fica assim. (%.1fx2 + %.1fx + %.1f = 0)", a, b, c  );
		
        //calculo formula de Bhaskara
		
		// 1º achar o delta
		double potDaRaiz = Math.pow(b, 2);
		double Delta = potDaRaiz - (4 * a * c);
						
		System.out.printf("o delta é: %.2f", Delta );
		
	    // comando para achar raiz quadrada é: " Math.sqrt();
		double raizDeDelta = Math.sqrt(Delta);
		double superior = - (b);
 		double inferior = 2 * a;
		
 		//2º achar x¹=?
 		double x1 = (superior + raizDeDelta) / inferior;
 		double x2 = (superior - raizDeDelta) / inferior;
 		
 		System.out.println("Conjunto solução é: x¹= "+ x1 + " é x²= "+ x2);
		
		
		entrada.close();
		
	}

}
