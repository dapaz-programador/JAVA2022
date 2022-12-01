package Fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		// Atalho syso + Ctrl + espaco
		//System.out.println(2 + 3);
		
		double raio = 3.4;
		// as constantes se escreve com letrs maiusculas  "PI"
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(PI * raio * raio);
		
		System.out.println(area);
		  
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area);
	}

}
