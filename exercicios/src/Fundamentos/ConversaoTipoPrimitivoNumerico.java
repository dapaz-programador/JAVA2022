package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;  // conversao implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888;  //conversao explícita chamada de (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;  //explícia (CAST)
		System.out.println(f);
		
		
	}

}
