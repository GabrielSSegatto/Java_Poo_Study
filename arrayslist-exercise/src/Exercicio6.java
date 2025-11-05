import java.util.ArrayList;

public class Exercicio6 {
	public static void main(String[] args) {
		//Crie uma função que receba um ArrayList de números inteiros e remova
		//todos os números pares da lista.
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(13);
		numeros.add(1974);
		numeros.add(78);
		numeros.add(0);
		numeros.add(21);
		
		System.out.println(removerPares(numeros));
	}
	
	public static ArrayList<Integer> removerPares (ArrayList<Integer> lista){
		
		for(int i = lista.size() -1; i >=0; i--) {
			if (lista.get(i)%2 == 0){
				lista.remove(i);
			}
		}
		return lista;
		
	}
}
