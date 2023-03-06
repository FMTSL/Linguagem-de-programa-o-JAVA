package ControleDeFluxo;

public class IfElse {

	public static void main(String[] args) {
		
		int estoque = 60;
		
		if(estoque >= 100) {
			System.out.println("Produto Suficiente");
		}
		else if (estoque < 100 && estoque > 50) {
			System.out.println("Alerta: Avaliar Novo Pedido!");
		}
		
		else {
			System.out.println("Faça Novo Pedido!");
		}

	}

}
