package aula5;

public class Main {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		Automovel carro2 = new Automovel();
		
		carro1.setMarca("Fiat");
		carro1.setAno(2024);
		carro1.setModelo("Pulse");
		carro1.ligar();
		carro2.ligar();
		
		Moto m1 = new Moto();
		m1.ligar();
	}
}
