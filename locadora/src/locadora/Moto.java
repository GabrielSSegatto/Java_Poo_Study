package locadora;

public class Moto extends Veiculo{
	private int cilindrada;
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public Double calcularAluguel(int dias)
	{
		return (double)(dias * getValorDiaria() *0.95);
		//motos tem um desconto padrão de 5%
	}
}
