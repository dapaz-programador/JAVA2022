package Fundamentos.OperadoresLogicos;

public class DesafiosAritmeticos {
	
	public static void main(String[] args) {
		
	//	int a = 3 + 4 - 10;
		// usa-se (math.pow(a,  b)); para operaçoes com potemncia
	//	int b = (int) Math.pow(a, 3);
		//outro exemplo:
	//	double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double superiorA = (numA / denA);
		
		System.out.println(numA);
		System.out.println(denA);
		System.out.println(superiorA);
		
		
		double numb = (1 - 5) * (2 - 7);
		double denb = 2;
		
		double superiorB = Math.pow((numb / denb), 2);
		
		System.out.println(numb);
		System.out.println(denb);
		System.out.println(superiorB);
		
		double superior = Math.pow((superiorA - superiorB), 3);
		double inferior = Math.pow(10, 3);
		
		System.out.println(superior);
		System.out.println(inferior);
		
		
		double desafio = (superior / inferior);
		
		System.out.println("O resultado é " + desafio);
	}

}
