package aula7;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Jose da silva");
		a1.setRa("12345678");
		a1.setCPF("111-222-333-45");
		
		Endereco end = new Endereco();
		end.setCep("71909000");
		end.setLogradouro("quadra 2");
		end.setNumero(6);
		
		a1.setEndereco(end);
	}
}
//String nome = JOptionPane.showInputDialog("informe o nome: ");
//int idade = Integer.valueOf(JOptionPane.showInputDialog("informe a idade: "));
