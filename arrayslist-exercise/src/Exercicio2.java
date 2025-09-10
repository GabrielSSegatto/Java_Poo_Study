import java.util.ArrayList;

public class Exercicio2 {
	public static void main(String[] args) {
		
		//Crie uma função que receba um ArrayList e retorne o número de elementos únicos na lista.
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Joao");
		nomes.add("Miguel");
		nomes.add("Maria");
		nomes.add("Joao");
		
		System.out.println(quantidadeDeValoresNaoRepetidos(nomes));
				
	
	}
	public static int quantidadeDeValoresNaoRepetidos(ArrayList<String> lista) {
		ArrayList<String> unicos = new ArrayList<String>();

		for(String n : lista) {
			if(!unicos.contains(n)) {
				unicos.add(n);
			}
		}
		
		return unicos.size();
	}
}
	
	
