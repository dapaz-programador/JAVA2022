package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	// Esta parte cria uma janela de dialogo (public static void main(String[] args)
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("A media é " + soma / 2);
		
		// quando você presira de precisao nos calculos,
		//deve se usado a função (BigDecimal)
	}

}
