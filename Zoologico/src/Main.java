
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
	
		List<Animal> listaAnimais = new ArrayList<>();
		
		Leao leao1 = new Leao();
		leao1.setHabitat("Savana");
		leao1.setIdade(12);
		leao1.setNome("Leo");
		leao1.setPeso(190);
		leao1.setTamanhoJuba(20);
		
		Gato gato1 = new Gato();
		gato1.setHabitat("Floresta");
		gato1.setIdade(3);
		gato1.setNome("Mia");
		gato1.setPeso(5);
		gato1.setCor("Laranja");
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setHabitat("Floresta");
		cachorro1.setIdade(5);
		cachorro1.setNome("Arquimedes");
		cachorro1.setPeso(8);
		cachorro1.setRaca("Pastor alemão");

		listaAnimais.add(leao1);
		listaAnimais.add(gato1);
		listaAnimais.add(cachorro1);
		
		for (Animal a : listaAnimais)
		{
	          System.out.println("Animl: " + a.getClass().getSimpleName());

	          System.out.println("Nome: " + a.getNome());
	          System.out.println("Som: " + a.emitirSom());
	          System.out.println("comida: " + a.alimentar());
	          System.out.println("Habitat: " + a.getHabitat());
	          System.out.println("Idade: " + a.getIdade());
	          System.out.println("Peso: " + a.getPeso());
	          System.out.println("----------");





		}
	}
}
