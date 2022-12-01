package Fundamentos.OperadoresLogicos;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		// Operadores Binário
		boolean tv50Polegadas = (trabalho1 && trabalho2);
		boolean tv32Polegadas = (trabalho1 ^ trabalho2);
		boolean FoiAoShooping = (tv50Polegadas || tv32Polegadas);
		
		// Operadores Unário
		boolean FamilhaTriste = (!FoiAoShooping);
		
		System.out.println("Comprou TV de 50 polegadas ? " + tv50Polegadas);
		System.out.println("Comprou TV de 32 polegadas ? " + tv32Polegadas);
		System.out.println("A familha foi ao shooping  tomar sorvete ? " + FoiAoShooping);
		System.out.println("A familha está triste ? " + FamilhaTriste );
		

		
	}

}
