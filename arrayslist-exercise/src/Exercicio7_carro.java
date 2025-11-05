
public class Exercicio7_carro {
	private int ano;
	private String modelo;
	private String marca;
	private int quantidadeCavalos;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidadeCavalos() {
		return quantidadeCavalos;
	}
	public void setQuantidadeCavalos(int quantidadeCavalos) {
		this.quantidadeCavalos = quantidadeCavalos;
	}
	
	public Exercicio7_carro(int ano, String modelo, String marca, int quantidadeCavalos) {
		this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.quantidadeCavalos = quantidadeCavalos;
	}
}
