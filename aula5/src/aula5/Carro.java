package aula5;

public class Carro extends Automovel {

	private boolean arCondicionado;

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	@Override
	public void ligar()
	{
		System.out.println("carro ligado");
	}
}
