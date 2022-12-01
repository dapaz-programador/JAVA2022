package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionarios
		
		// Tipos nu´mericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		
		// 1ºcauculo Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// 2ºcauculo Números de viagens
		System.out.println(numeroDeVoos / 2);
		
		// 3ºcauculo Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// 4º id
		System.out.println(id + ": ganha ->" + salario);
		
		//5º Ferias 
		System.out.println("Ferias?" + estaDeFerias);
		
		//6º Status
		System.out.println("Status: " + status);
		
		
	}

}
