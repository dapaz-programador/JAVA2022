package Fundamentos.OperadoresLogicos;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 4.6;
				
		String resultadoParcial = media >= 5.0 ? 
				"em reculpera��o. " : "reprovado.";
		
		String resultadoFinal = media >= 7.0 ?
				"aprovado " :  resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		
		double nota = 8.5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s", resultado);
		
		
	}

}
