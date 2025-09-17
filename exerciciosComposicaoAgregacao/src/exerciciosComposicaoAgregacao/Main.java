package exerciciosComposicaoAgregacao;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String nomeB = JOptionPane.showInputDialog("Entre com o nome da biblioteca: ");
		Biblioteca biblioteca = new Biblioteca(nomeB);
		
		Livro Hobbit = new Livro("Hobbit", " J. R. R. Tolkien", 1937 );
		
		biblioteca.AdicionarLivros(Hobbit);
		
		String opcao = JOptionPane.showInputDialog("Digite 'p' para fehcar o programa, 'a' para adicionar um livro a biblioteca, e 'c' para consultar os livros da biblioteca");

		char opt = opcao.charAt(0);
		
		while (opt != 'p') {
			if (opt == 'a' ) {c
				String nome;
				String autor;
				int anoPublicacao;
				nome = JOptionPane.showInputDialog("digite o nome do livro: ");
				autor = JOptionPane.showInputDialog("digite o autor do livro: ");
				anoPublicacao = Integer.valueOf(JOptionPane.showInputDialog("digite o ano de publicação do livro: "));
				Livro livro = new Livro(nome, autor, anoPublicacao);
				biblioteca.AdicionarLivros(livro);
			}
			else if (opt == 'c') {
				System.out.println(biblioteca.MostrarLivros());
			}
			else {
		        JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
			opcao = JOptionPane.showInputDialog("Digite 'p' para fechar o programa, 'a' para adicionar um livro, 'c' para consultar livros:");
		    opt = opcao.charAt(0);
		}
	}
}
