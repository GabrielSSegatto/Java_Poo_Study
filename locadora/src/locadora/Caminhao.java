package locadora;

public class Caminhao extends Veiculo {
	private double capacidadeCarga;
	
	

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}



	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}



	@Override
	public Double calcularAluguel(int dias) {
		return (double) (dias * getValorDiaria() + 200);
		// taxa adicional fixa pra caminão de 200 reais
		}
}
