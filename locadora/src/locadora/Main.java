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
		moto1.setCilindrada(160);
		
		 Caminhao caminhao1 = new Caminhao();
	     caminhao1.setMarca("Volvo");
	     caminhao1.setModelo("FH 540");
	     caminhao1.setAno(2019);
	     caminhao1.setValorDiaria(100.0);
	     caminhao1.setPlaca("XYZ-5678");
	     caminhao1.setCapacidadeCarga(1.6);
	
	     Carro carro1 = new Carro();
	     carro1.setMarca("Chevrolet");
	     carro1.setModelo("Omega CD");
	     carro1.setAno(1996);
	     carro1.setPlaca("GHI-4567");
	     carro1.setValorDiaria(100.0);
	     carro1.setQuantidadePortas(4);
	     
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
	          if (v instanceof Carro) {
	    	      Carro carro = (Carro) v;
	    	      System.out.println("Portas: " + carro.getQuantidadePortas());
	    	  } else if (v instanceof Moto) {
	    	      Moto moto = (Moto) v;
	    	      System.out.println("Cilindrada: " + moto.getCilindrada());
	    	  } else if (v instanceof Caminhao) {
	    	      Caminhao caminhao = (Caminhao) v;
	    	      System.out.println("Capacidade: " + caminhao.getCapacidadeCarga());
	    	  }}
	          System.out.println("----------");
	     }
	     
}

