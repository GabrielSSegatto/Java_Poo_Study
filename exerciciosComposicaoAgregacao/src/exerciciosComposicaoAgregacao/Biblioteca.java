package exerciciosComposicaoAgregacao;
import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> livros = new ArrayList<>();
	
	public Biblioteca(String nome) {
		this.nome = nome;
	}
	
	public void AdicionarLivros(Livro livro) {
		livros.add(livro);
	}
	public ArrayList<Livro>  MostrarLivros() {
		return livros;
	}
}
