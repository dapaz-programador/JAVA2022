package Fundamentos.OperadoresLogicos;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);  // (==) é igual ?
		System.out.println(30 != 7); // (!=) não é igual !
		System.out.println(3 > 4);   // (> ) maior qué? 
		System.out.println(3 >= 3);  // (>=) maior ou igual ?
		System.out.println(3 < 7);   // (< ) menor que?
		System.out.println(30 <= 7); // (<=) menor ou igual ?
		
		double nota = 8.5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
