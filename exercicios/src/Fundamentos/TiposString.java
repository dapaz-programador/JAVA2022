package Fundamentos;

public class TiposString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");		
		System.out.println(s.startsWith("Boa")); //".startsWith" verifica se a string inicia com a palavra (Boa)
		System.out.println(s.startsWith("boa"));		
		System.out.println(s.toLowerCase().startsWith("boa"));//".toLowerCase" tem a função de não considerar letras minuscolas e maiuscolas
		System.out.println(s.endsWith("tarde")); //".endsWith" verifica se a string termina com a palavra (tarde)
		System.out.println(s.toLowerCase().startsWith("TARDE")); //".toUpperCase" tem a função de considerar todas as letras minuscolas 		
		System.out.println(s.length()); //"length" verifica quantos caracteres tem uma string
		System.out.println(s.equals("boa tarde")); //".equals" tem a função de comparação de igualdade
		System.out.println(s.equalsIgnoreCase("boa tarde")); //".equalsIgnoreCase" não considera letras maiusculas nem minusculas
		
		var nome = "Pedro";
		var sobrenome = "santos";
		var idade = 33;
		var salario = 12345.987;
		
		//" (/n) usado para quebra de linha. 
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + " \nIdeda: " + idade + " \nSalario: " + salario );
		
		// outra forma de fazer. /   (%s)                      /  (%d) colocar numeros inteiros / (%.2f.) duas casas decimais		
		System.out.printf("O senhor  %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
				
		//outra forma de fazer.		
		String frase = String.format("\nO senhor  %s %s tem %d e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6)); // Mostra um trecho  a parti do caracteres 6 
		System.out.println("Frase qualquer".substring(6, 8)); // Mostra os elementos que estão nos caracteres da posição 6 ate 7, a posição 8 não e inclusa. 
				
				
		
		
		
		
	}

}
