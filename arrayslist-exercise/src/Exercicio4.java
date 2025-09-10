import java.util.ArrayList;

public class Exercicio4 {
	public static void main(String[] args) {
	
		//Crie uma função que receba um ArrayList de números inteiros e 
		//retorne o índice do menor número na lista.

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(13);
		numeros.add(1974);
		numeros.add(78);
		numeros.add(0);
		numeros.add(21);
		
		System.out.println(MenorNumero(numeros));

	}

	public static int MenorNumero( ArrayList<Integer> lista) {
		int menor = Integer.MAX_VALUE;
		int posicao = 0;
		int posicaoDoMenor = 0;
		
		for(Integer n : lista) {
			
			if(n < menor) {
				menor = n;
				posicaoDoMenor = posicao;
			}
			posicao ++;
		}
		return posicaoDoMenor;
		
	}
}
