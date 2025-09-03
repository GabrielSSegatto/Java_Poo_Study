package locadora;

public class Caminhao extends Veiculo {
	private double capacidadeCarga;

	@Override
	public Double calcularAluguel(int dias) {
		return (double) (dias * getValorDiaria() + 200);
		// taxa adicional fixa pra caminão de 200 reais
		}
}
