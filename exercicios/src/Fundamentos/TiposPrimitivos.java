package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcionarios
		
		// Tipos nu�mericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		
		// 1�cauculo Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// 2�cauculo N�meros de viagens
		System.out.println(numeroDeVoos / 2);
		
		// 3�cauculo Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// 4� id
		System.out.println(id + ": ganha ->" + salario);
		
		//5� Ferias 
		System.out.println("Ferias?" + estaDeFerias);
		
		//6� Status
		System.out.println("Status: " + status);
		
		
	}

}
