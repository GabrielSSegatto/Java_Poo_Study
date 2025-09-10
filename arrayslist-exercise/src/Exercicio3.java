import java.util.ArrayList;

public class Exercicio3 {
	public static void main(String[] args) {

		//Crie uma função que receba dois ArrayLists e retorne
		//um novo ArrayList que contenha todos os exclusivos de ambos os ArrayLists
		
		ArrayList<String> nomes1 = new ArrayList<String>();
		ArrayList<String> nomes2 = new ArrayList<String>();
		
		nomes1.add("Joao");
		nomes1.add("Miguel");
		nomes1.add("Maria");
		
		nomes2.add("Carla");
		nomes2.add("Pedro");
		nomes2.add("Maria");
		nomes2.add("Moises");
		
		System.out.println(juntarDuasListas(nomes1,nomes2));

	}
	
	public static ArrayList<String> juntarDuasListas(ArrayList<String> lista1, ArrayList<String> lista2 ) {
		ArrayList<String> listaCompleta = new ArrayList<String>();
		
		for(String n : lista1) {
			if(!listaCompleta.contains(n)) {
				listaCompleta.add(n);
			}
		}
			
		for(String m : lista2) {
			if(!listaCompleta.contains(m)) {
				listaCompleta.add(m);
			}
		}
		return listaCompleta;
		
	}
}
