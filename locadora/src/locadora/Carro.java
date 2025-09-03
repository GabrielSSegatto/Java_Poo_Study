package locadora;

public class Carro extends Veiculo {

	private int quantidadePortas;
	
	@Override
	public Double calcularAluguel(int dias) {
		return (double) (dias * getValorDiaria() + 50);
		// taxa adicional fixa pra carro de 50 reais
	}
	
}
