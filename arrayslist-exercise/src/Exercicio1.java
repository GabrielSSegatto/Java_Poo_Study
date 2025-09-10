import java.util.ArrayList;

public class Exercicio1 {
	//Crie um ArrayList e adicione alguns elementos a ele. Em seguida, imprima o 
	//tamanho da lista e verifique se um elemento específico está presente na lista.
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("joao");
		nomes.add("Miguel");
		nomes.add("Maria");
		
		System.out.println("Tamanho da lista "+ nomes.size());
		
		 if (nomes.contains("joao")) {
	            System.out.println("O elemento 'joao' está presente na lista.");
	        } else {
	            System.out.println("O elemento 'joao' não está presente na lista.");
	        }
	}
	
	
}
