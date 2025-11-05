package aula6;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> disciplinas = new ArrayList<String>();
		
		disciplinas.add("Banco de dados II");
		disciplinas.add("POO");
		disciplinas.add("Desenvolvimento de interfaces");
		disciplinas.add("Álgebra");
		
		System.out.println(disciplinas);
		System.out.println(disciplinas.get(2));

		disciplinas.set(0,  "Banco de dados I");
		System.out.println(disciplinas);
		
		disciplinas.remove(3);
		System.out.println(disciplinas);
		
		for(int i =0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i));
		}
		for(String a : disciplinas) {
			System.out.println(a);
		}
	}
}
