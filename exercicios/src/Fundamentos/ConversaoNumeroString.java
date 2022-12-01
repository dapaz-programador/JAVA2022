package Fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		// Forma de converter numero inteiro(int) para String:
		Integer num1 = 1000;
		System.out.println(num1.toString()); 
		System.out.println(num1.toString().length()); // a extensao (".length") serve para mostra quantos caracteres tem a String.
		
		// Outra forma 
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());// a extensao (".length") serve para mostra quantos caracteres tem a String.
		
		System.out.println(("" + num1));
		System.out.println(("" + num1).length());// a extensao (".length") serve para mostra quantos caracteres tem a String.
		
		System.out.println(("" + num2));
		System.out.println(("" + num2).length());// a extensao (".length") serve para mostra quantos caracteres tem a String.
	}

}
