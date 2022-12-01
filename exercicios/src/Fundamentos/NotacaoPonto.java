package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
	
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		
		
		System.out.println("Leo".toUpperCase());
		
		// outra forma de faser 
		String x = "Leoo".toUpperCase();
		System.out.println(x);
		
		//##################
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		
		// outra forma 
		
		String yy = "Bom dia X"
				.replace("X", "Guii")
				.toUpperCase()
				.concat("!!!");
		System.out.println(yy);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);		
		
	}

}
