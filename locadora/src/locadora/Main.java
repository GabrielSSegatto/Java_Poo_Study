package locadora;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[]args) {
		
		List<Veiculo> listaVeiculos = new ArrayList<>();
		
		Moto moto1 = new Moto();
		moto1.setMarca("Honda");
		moto1.setModelo("CG 160");
		moto1.setAno(2020);
		moto1.setPlaca("ABC-1235");
		moto1.setValorDiaria(50.00);
		
		 Caminhao caminhao1 = new Caminhao();
	     caminhao1.setMarca("Volvo");
	     caminhao1.setModelo("FH 540");
	     caminhao1.setAno(2019);
	     caminhao1.setValorDiaria(100.0);
	     caminhao1.setPlaca("XYZ-5678");
	
	     Carro carro1 = new Carro();
	     carro1.setMarca("Chevrolet");
	     carro1.setModelo("Omega CD");
	     carro1.setAno(1996);
	     carro1.setPlaca("GHI-4567");
	     carro1.setValorDiaria(100.0);
	     
	     listaVeiculos.add(moto1);
	     listaVeiculos.add(carro1);
	     listaVeiculos.add(caminhao1);
	     
	     for (Veiculo v : listaVeiculos) {
	          System.out.println("Tipo: " + v.getClass().getSimpleName());
	          System.out.println("Marca: " + v.getMarca());
	          System.out.println("Modelo: " + v.getModelo());
	          System.out.println("Ano: " + v.getAno());
	          System.out.println("Placa: " + v.getPlaca());
	          System.out.println("Valor do aluguel por 5 dias: R$ " + v.calcularAluguel(5));
	          System.out.println("----------");
	     }
	     
	}
}
