package aula5;

public abstract class Automovel {
	private String marca;
	private String modelo;
	private int ano;
	
	public abstract void ligar();

	
	public void ligar(boolean puxouAfogador) {
		if(puxouAfogador){
			System.out.println("Automovel ligado");
		}
		else {
			System.out.println("Automovel afogado");
		}
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
