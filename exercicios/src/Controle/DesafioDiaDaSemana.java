package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	
	public static void main(String[] args) {
		
		
		//Domingo -> 1 | segunda ->2 | terça -> 3 ...
		// retorne o numero do dia da semana
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do dia: ");
		
		String dia = entrada.next();
		
		// sempre quando for comparar duas strings, é melhor
		// utilizar a função " .equalsIgnoreCase( ) " atenção "IgnoreCase" serve para ignorar letras maiuscolas ou minuscolas.
		if("domingo".equalsIgnoreCase(dia)) {
			    System.out.println( 1 );
			} else if("segunda".equalsIgnoreCase(dia)) {
			    System.out.println( 2 );	
			} else if("terça".equalsIgnoreCase(dia)
				   || "terca".equalsIgnoreCase(dia)){
		        System.out.println( 3 );	
	        } else if("quarta".equalsIgnoreCase(dia)) {
		        System.out.println( 4 );	
	        } else if("quinta".equalsIgnoreCase(dia)) {
		        System.out.println( 5 );	
	        } else if("sexta".equalsIgnoreCase(dia)) {
	        	System.out.println( 6 );	
	        } else if("sabado".equalsIgnoreCase(dia)
	        	   || "sábado".equalsIgnoreCase(dia)) {
	        	System.out.println( 7 );	
	        } else {
	        	System.out.println("Dia invalido!!");
	        }
		
		entrada.close();
	}

}
