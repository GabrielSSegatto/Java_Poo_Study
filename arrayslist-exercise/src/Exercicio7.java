import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercicio7 {
	public static void main(String[] args) {

		//Crie uma função que receba um ArrayList de objetos e 
		//ordene a lista por um atributo específico dos objetos.
		Exercicio7_carro carro1 = new Exercicio7_carro(1996, "Omega CD", "Chevrolet", 181);
		Exercicio7_carro carro2 = new Exercicio7_carro(2020, "Civic", "Honda", 158);
		Exercicio7_carro carro3 = new Exercicio7_carro(2021, "Corolla", "Toyota", 177);
		Exercicio7_carro carro4 = new Exercicio7_carro(2019, "Focus", "Ford", 170);
	    Exercicio7_carro carro5 = new Exercicio7_carro(2022, "A3", "Audi", 190);
	    
	    ArrayList<Exercicio7_carro> listaCarros = new ArrayList<Exercicio7_carro>();
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        listaCarros.add(carro4);
        listaCarros.add(carro5);
        
        System.out.println(ordenarPorIdade(listaCarros));
	}
	
    public static ArrayList<Exercicio7_carro> ordenarPorIdade(ArrayList<Exercicio7_carro> carros) {
        ArrayList<Exercicio7_carro> listaPorIdade = new ArrayList<>(carros);

        Collections.sort(listaPorIdade, new Comparator<Exercicio7_carro>() {
            @Override
            public int compare(Exercicio7_carro c1, Exercicio7_carro c2) {
                return c1.getAno() - c2.getAno(); 
            }
        });

        return listaPorIdade;
    }
}
