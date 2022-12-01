package Fundamentos.OperadoresLogicos;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // atencao isso é o mesmo que ( 2 = 2)
		System.out.println(a); // 2
		System.out.println(b); // 1
		
	}

}
