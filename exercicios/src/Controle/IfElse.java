package Controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		// if = se? // else = se n�o	?
	
		
		String valor = JOptionPane.showInputDialog(
				"Informe o n�mero: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("N�mero par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("N�mero impar!");
		}
		
	    // outra forma usando o else	
		if(numero % 2 == 0) { 
			System.out.println("N�mero par!");
		    }
		else { 
				System.out.println("N�mero �mpar! ");
			}
		}
		
	

}
