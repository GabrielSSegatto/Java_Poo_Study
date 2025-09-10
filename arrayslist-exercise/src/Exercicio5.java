import java.util.ArrayList;

public class Exercicio5 {
	public static void main(String[] args) {
	//Crie uma função que receba um ArrayList de strings e 
	//retorne o número de ocorrências de uma string específica na lista.
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Joao");
		nomes.add("Miguel");
		nomes.add("Maria");
		nomes.add("Joao");
		
		System.out.println(verificarOcorrencias(nomes, "Joao"));
	}
	
	public static int verificarOcorrencias(ArrayList<String> lista, String elemento) {
		int quantidade = 0;
		for(String n :lista) {
			if(n == elemento) {
				quantidade ++;
			}
		}
		return quantidade;
	}
}
