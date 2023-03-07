package controleremoto;

public class TesteControle {

	public static void main(String[] args) {
		
		ControleRemoto novoControle = new ControleRemoto();
		
		System.out.println("Chamando carro: " + novoControle.controlar("Carro"));
		
		System.out.println("Chamando avião: " + novoControle.controlar("Avião", true));
		
		System.out.println("Chamando barcos: " + novoControle.controlar("Barco", true, true));
	}
}
